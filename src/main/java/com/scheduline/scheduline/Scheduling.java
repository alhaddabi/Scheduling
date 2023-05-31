package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 9-17 * * 0-4")
    public void SchedulerTask()
    {
        System.out.println("runs a job every hour on the hour from 9:00 AM to 5:00 PM on weekdays.");
    }

}

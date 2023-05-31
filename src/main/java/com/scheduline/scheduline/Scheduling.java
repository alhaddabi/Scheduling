package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 6-20 * * 0-4")
    public void SchedulerTask()
    {
        System.out.println("runs a job every hour from 6:00 AM to 8:00 PM on weekdays");
    }

}

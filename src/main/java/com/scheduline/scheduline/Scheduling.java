package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* */10 9-17 * * 0-4")
    public void SchedulerTask()
    {
        System.out.println("runs a job every 10 minutes between 9:00 AM and 5:00 PM on weekdays");
    }

}

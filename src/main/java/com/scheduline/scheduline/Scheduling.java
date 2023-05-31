package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "0 0,30 8-17 * * 5-6")
    public void SchedulerTask()
    {
        System.out.println("runs a job every 30 minutes during business hours (8:00 AM to 5:00 PM) on weekdays.");
    }

}

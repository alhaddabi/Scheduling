package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "0 0 9-17 * * 5-6")
    public void SchedulerTask()
    {
        System.out.println("runs a job every hour on weekdays between 9:00 AM and 5:00 PM");
    }

}

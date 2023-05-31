package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = " 0 */15 8-22 * * *")
    public void SchedulerTask()
    {
        System.out.println(" runs a job every 15 minutes between 8:00 AM and 10:45 PM every day.");
    }

}

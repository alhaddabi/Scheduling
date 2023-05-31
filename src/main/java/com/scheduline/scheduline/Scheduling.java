package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* */10 8-14 * * 0-4")
    public void SchedulerTask()
    {
        System.out.println("runs a job every 10 minutes on weekdays between 8:00 AM and 3:00 PM.");
    }

}

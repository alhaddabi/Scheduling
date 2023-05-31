package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* * 8 * * 2")
    public void SchedulerTask()
    {
        System.out.println("runs a job every Monday at 8:00 AM.");
    }

}

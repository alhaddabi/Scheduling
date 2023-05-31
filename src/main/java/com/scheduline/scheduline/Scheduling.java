package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 22 * 7-9 0")
    public void SchedulerTask()
    {
        System.out.println(" runs a job at 10:00 PM every Sunday in the months of July, August, and September.");
    }

}

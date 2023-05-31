package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 30 3 * * * 1-5")
    public void SchedulerTask()
    {
        System.out.println(" runs a job at 3:30 AM every day except Saturday and Sunday.");
    }

}

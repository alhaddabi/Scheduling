package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 30 23 * * 6")
    public void SchedulerTask()
    {
        System.out.println(" runs a job at 11:30 PM every Friday.");
    }

}

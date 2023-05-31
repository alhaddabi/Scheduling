package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 15 8 * * 0-5")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 8:15 AM every weekday except Friday");
    }

}

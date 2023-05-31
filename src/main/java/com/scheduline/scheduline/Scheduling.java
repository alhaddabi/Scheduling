package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 23 * * *")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 11:00 PM every day of the year.");
    }

}

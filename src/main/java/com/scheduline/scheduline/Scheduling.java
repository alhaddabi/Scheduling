package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 30 16 1,15 * * ")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 4:30 PM on the 1st and 15th days of every month.");
    }

}

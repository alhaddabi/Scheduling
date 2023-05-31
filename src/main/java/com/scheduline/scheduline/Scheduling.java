package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 12 * * 2")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 12:00 PM on the first Monday of every month.");
    }

}

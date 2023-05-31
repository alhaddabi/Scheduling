package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 30 17 1 * *")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 5:30 PM on the first day of every month.");
    }

}

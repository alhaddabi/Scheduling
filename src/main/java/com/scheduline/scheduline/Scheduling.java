package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 5 * 1 * *")
    public void SchedulerTask()
    {
        System.out.println("runs a job every 5 minutes on the 1st day of every month.");
    }

}

package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 30 14 * * * *")
    public void SchedulerTask()
    {
        System.out.println("runs a job every day at 2:30 PM.");
    }

}

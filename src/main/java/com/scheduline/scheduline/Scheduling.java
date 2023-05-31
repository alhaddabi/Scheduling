package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "0 30 19,22 * * 0")
    public void SchedulerTask()
    {
        System.out.println("runs a job every Sunday at 7:30 PM and 10:30 PM");
    }

}

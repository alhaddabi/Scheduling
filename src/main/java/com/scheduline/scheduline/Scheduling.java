package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 15 3 * * * *")
    public void SchedulerTask()
    {
        System.out.println(" runs a job at 3:15 AM every day");
    }

}

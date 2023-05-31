package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "0 0 3 * * *")
    public void SchedulerTask()
    {
        System.out.println(" runs a job every day at 3:00 AM");
    }

}

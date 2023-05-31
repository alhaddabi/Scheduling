package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "0 0 3 1 * *")
    public void SchedulerTask()
    {
        System.out.println("runs a job every month on the first day of the month at 3:00 AM.");
    }

}

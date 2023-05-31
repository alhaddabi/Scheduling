package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 8 1-30 * *")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 8:00 AM every day, except for the last day of the month");
    }

}

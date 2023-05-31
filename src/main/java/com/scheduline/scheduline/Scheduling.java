package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 3 * 11 0-4")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 3:00 AM on weekdays in the month of November.");
    }

}

package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 12 * 7 1-6")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 12:00 PM every day except Sunday in the month of July");
    }

}

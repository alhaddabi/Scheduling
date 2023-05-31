package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 30 13 2-30 * 5")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 1:30 PM on the second to last Friday of every month.");
    }

}

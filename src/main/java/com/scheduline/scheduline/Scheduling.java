package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0,30 18-23 * * 0-4")
    public void SchedulerTask()
    {
        System.out.println(" runs a job at the bottom of every hour (i.e., at :00 and :30 minutes past the hour) between 6:00 PM and midnight on weekdays");
    }

}

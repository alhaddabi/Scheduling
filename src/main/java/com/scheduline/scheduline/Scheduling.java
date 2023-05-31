package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* */10 9-17 * * 5-6")
    public void SchedulerTask()
    {
        System.out.println("runs a job every 10 minutes but only between 9:00 AM and 6:00 PM on weekdays.");
    }

}

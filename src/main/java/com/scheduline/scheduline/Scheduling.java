package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* */15 14-22 * * 0-4")
    public void SchedulerTask()
    {
        System.out.println("runs a job every 15 minutes from 2:00 PM to 10:00 PM on weekends");
    }

}

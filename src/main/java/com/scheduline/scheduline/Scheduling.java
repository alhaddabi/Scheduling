package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* */5 * * * 0-4" +
                      "* */15 * * * 5-6")
    public void SchedulerTask()
    {
        System.out.println("runs a job every 5 minutes on weekdays and every 15 minutes on weekends.");
    }

}

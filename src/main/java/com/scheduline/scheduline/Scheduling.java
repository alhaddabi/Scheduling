package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 30 * 15,30 * * ")
    public void SchedulerTask()
    {
        System.out.println("runs a job every 30 minutes on the 15th and 30th day of every month.");
    }

}

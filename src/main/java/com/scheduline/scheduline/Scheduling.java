package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 30 23 13 * 5")
    public void SchedulerTask()
    {
        System.out.println(" runs a job at 11:30 PM every Friday the 13th");
    }

}

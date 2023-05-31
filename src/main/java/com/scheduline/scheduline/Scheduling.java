package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 9-17 15 * *")
    public void SchedulerTask()
    {
        System.out.println(" runs a job at the top of every hour between 9:00 AM and 5:00 PM on the 15th day of the month");
    }

}

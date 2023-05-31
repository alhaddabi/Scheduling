package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 1 15 * *")
    public void SchedulerTask()
    {
        System.out.println(" runs a job every hour on the 15th day of the month");
    }

}

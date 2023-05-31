package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 * 1-15 * *")
    public void SchedulerTask()
    {
        System.out.println("runs a job every hour during the first half of the month");
    }

}

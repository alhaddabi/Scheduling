package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 06-23 * * *")
    public void SchedulerTask()
    {
        System.out.println("runs a job every 2 hours between 10:00 PM and 6:00 AM");
    }

}

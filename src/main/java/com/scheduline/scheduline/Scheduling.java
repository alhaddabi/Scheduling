package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 30 16 7,8 0-4 *")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 4:30 PM on weekdays in July and August");
    }

}

package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 0 1 1,4,7,10 *")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 12:00 AM on the first day of every quarter(January, April, July, and October)");
    }

}

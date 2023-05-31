package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* 0 22 * 12 *")
    public void SchedulerTask()
    {
        System.out.println("runs a job at 10:00 PM every day in the month of December");
    }

}

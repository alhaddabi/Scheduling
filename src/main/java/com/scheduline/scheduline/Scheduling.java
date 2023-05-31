package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* * 0 0+2 */\n")
    public void SchedulerTask()
    {
        System.out.println("runs a job every hour but only on even-numbered days of the month.");
    }

}

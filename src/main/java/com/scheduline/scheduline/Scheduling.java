package com.scheduline.scheduline;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = "* * 18 * 3-10 *")
    public void SchedulerTask()
    {
        System.out.println(" runs a job every day at 6:00 PM during daylight saving time (DST) in the United States");
    }

}

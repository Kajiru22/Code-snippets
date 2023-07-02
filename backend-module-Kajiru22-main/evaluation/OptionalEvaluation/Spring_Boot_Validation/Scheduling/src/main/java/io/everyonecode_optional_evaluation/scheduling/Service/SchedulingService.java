package io.everyonecode_optional_evaluation.scheduling.Service;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
@EnableScheduling
@Async
public class SchedulingService {

    @Scheduled(fixedDelay = 5000)
    public void every5sec() {
        System.out.println("Fixed delay message every 5 seconds.");
    }

    @Scheduled(fixedDelay = 2000)
    public void every2sec() {
        System.out.println("Fixed delay message every 2 seconds.");
    }

    /*@Scheduled(fixedDelay = 30000, cron = /2 9-18 * * 1-5)
    public void cron() {
        System.out.println("Cron message every interval");
    }*/
}

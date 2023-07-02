package io.everyonecodes_week5_nosql.the_final_countdown.Runner;

import io.everyonecodes_week5_nosql.the_final_countdown.Service.CountdownManager;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TheFinalCountDownRunner {

    @Bean
    ApplicationRunner runCountdown(CountdownManager countdownManager) {
        return args -> {
            countdownManager.startCountdown();
        };
    }
}

package io.everyonecodes_week5_nosql.punch_cards.Runner;
import io.everyonecodes_week5_nosql.punch_cards.Service.PunchCardService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PunchCardRunner {

    @Bean
    ApplicationRunner runPunchCard(PunchCardService punchCardService) {
        return args -> {
            punchCardService.save();
        };
    }
}

package io.everyonecodes.week2_properties.rock_scissors_paper.configuration;

import io.everyonecodes.week2_properties.rock_scissors_paper.logic.Game;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameRunner {

    @Bean
    ApplicationRunner run(Game game) {
        return args -> game.play();
    }
}

package io.everyonecodes.week1_springbeans.amazing_goodbye_world;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazingGoodbyeWorldConfiguration {
    @Bean
    AmazingGoodbyeWorld amazingGoodbyeWorld() {
        return new AmazingGoodbyeWorld();
    }

    @Bean
    Goodbye goodbye() {
        return new Goodbye();
    }

    @Bean
    World world() {
        return new World();
    }
}

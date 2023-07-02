package io.everyonecodes.week4_spring_web2.marathon_integration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;
@Configuration
@ConfigurationProperties("integration")
public class RunnerConfiguration {

    private List<Runner> runners;

    private Runner winner;


    @Bean
    List<Runner> runners() {
        return runners;
    }

    @Bean
    Runner winner() {
        return winner;
    }

    public void setRunners(List<Runner> runners) {
        this.runners = runners;
    }

    public void setWinner(Runner winner) {
        this.winner = winner;
    }
}

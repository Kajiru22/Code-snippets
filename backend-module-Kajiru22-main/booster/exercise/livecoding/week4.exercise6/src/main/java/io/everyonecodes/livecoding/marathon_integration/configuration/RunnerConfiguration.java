package io.everyonecodes.livecoding.marathon_integration.configuration;

import io.everyonecodes.livecoding.marathon_integration.data.Runner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
@ConfigurationProperties("result")
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

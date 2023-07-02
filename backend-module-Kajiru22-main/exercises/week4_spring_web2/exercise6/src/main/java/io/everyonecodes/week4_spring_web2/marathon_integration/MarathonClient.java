package io.everyonecodes.week4_spring_web2.marathon_integration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Controller
public class MarathonClient {

    private final RestTemplate restTemplate;
    private final String runners;
    private final String winner;

    public MarathonClient(RestTemplate restTemplate,
                          @Value("${url.runners}") String runners,
                          @Value("${url.winner}") String winner) {
        this.restTemplate = restTemplate;
        this.runners = runners;
        this.winner = winner;
    }

    public Runner winner() {
       return restTemplate.getForObject(winner, Runner.class);
    }

    public Runner runners(Runner runner) {
        return restTemplate.postForObject(runners, runner, Runner.class);
    }
}
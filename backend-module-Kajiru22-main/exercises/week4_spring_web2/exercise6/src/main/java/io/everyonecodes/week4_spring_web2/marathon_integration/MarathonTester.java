package io.everyonecodes.week4_spring_web2.marathon_integration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarathonTester {

    private final MarathonClient client;
    private final List<Runner> runners;
    private final Runner winner;
    private final String error;
    private final String noWinner;
    private final String incorrectWinner;
    private final String success;
    private final String correctly;

    public MarathonTester(MarathonClient client, List<Runner> runners, Runner winner,
                          @Value("${messages.error}")String error,
                          @Value("${messages.noWinner}")String noWinner,
                          @Value("${messages.incorrectWinner}")String incorrectWinner,
                          @Value("${messages.success}")String success,
                          @Value("${messages.correctly}")String correctly) {
        this.client = client;
        this.runners = runners;
        this.winner = winner;
        this.error = error;
        this.noWinner = noWinner;
        this.incorrectWinner = incorrectWinner;
        this.success = success;
        this.correctly = correctly;
    }

    public TestResult test() {
        Runner winner = client.winner();
        return new TestResult(success, correctly);
    }
}

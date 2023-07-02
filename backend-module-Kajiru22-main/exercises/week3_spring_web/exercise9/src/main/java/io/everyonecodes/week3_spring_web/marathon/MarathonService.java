package io.everyonecodes.week3_spring_web.marathon;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class MarathonService {

    Set<Runner> runners = new HashSet<>();

    public MarathonService() {
    }

    public void add(Runner runner) {
        runners.add(runner);
    }
    public Runner findWinner() {
        return runners.stream()
                .min((r1, r2) -> r1.getDuration().compareTo(r2.getDuration()))
                .orElse(null);
    }
    public Set<Runner> getRunners() {
        return runners;
    }
}

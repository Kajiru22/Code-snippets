package io.everyonecodes.week3_spring_web.marathon;

import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/runners")
public class MarathonEndpoint {

    private final MarathonService marathonService;

    public MarathonEndpoint(MarathonService marathonService) {
        this.marathonService = marathonService;
    }

    /*@GetMapping("/runners")
    public Set<Runner> getRunners() {
        return marathonService.getRunners();
    }*/
    @GetMapping
    public Set<Runner> allRunner() {
        return marathonService.getRunners();
    }

    @PostMapping
    public Runner add(@RequestBody Runner runner) {
        marathonService.add(runner);
        return runner;
    }

    @GetMapping("/winner")
    public Runner findWinner() {
        return marathonService.findWinner();
    }
}

package io.everyonecodes.week3_spring_web.interactions.Endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/negation")
public class NegationEndpoint {
    @PostMapping()
    boolean negation(@RequestBody boolean bool) {
        return (!bool);
    }
}

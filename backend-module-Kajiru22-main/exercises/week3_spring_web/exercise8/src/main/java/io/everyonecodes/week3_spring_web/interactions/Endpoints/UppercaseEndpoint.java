package io.everyonecodes.week3_spring_web.interactions.Endpoints;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/uppercase")
public class UppercaseEndpoint {

    @PostMapping()
    String uppercase(@RequestBody String word) {
        return word.toUpperCase();
    }
}

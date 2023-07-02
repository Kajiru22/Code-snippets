package io.everyonecodes.week3_spring_web.marco_polo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MarcoPoloEndpoint {

    @GetMapping("/{word}")
    String getWord(@PathVariable String word) {
        return word;
    }

    @GetMapping("/marco")
    String marco() {
        return "what?";
    }

    @GetMapping("/Marco")
    String marcoPolo() {
        return "Polo";
    }
}
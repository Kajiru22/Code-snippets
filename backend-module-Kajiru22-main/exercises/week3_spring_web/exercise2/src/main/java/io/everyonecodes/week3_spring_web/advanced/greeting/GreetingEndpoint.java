package io.everyonecodes.week3_spring_web.advanced.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class GreetingEndpoint {

    private String message;

    public GreetingEndpoint(@Value("${greeting}")String message) {
        this.message = message;
    }

    @GetMapping
    String getMessage() {
        return message;
    }
}

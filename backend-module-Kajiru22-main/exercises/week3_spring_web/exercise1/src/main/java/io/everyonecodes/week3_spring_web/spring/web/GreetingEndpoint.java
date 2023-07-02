package io.everyonecodes.week3_spring_web.spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingEndpoint {

    @GetMapping
    String getMessage() {
        return "Hello there!";
    }

    @GetMapping("/test")
    String getMessage2() {
        return "Hello test";
    }
}

package io.everyonecodes.week3_spring_web.basic_types;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class NumberEndpoint {

    @GetMapping("/number")
    int getNumber() {
        return 42;
    }
}

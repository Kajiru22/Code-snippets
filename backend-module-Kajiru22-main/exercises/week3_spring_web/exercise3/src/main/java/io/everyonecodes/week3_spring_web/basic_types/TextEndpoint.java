package io.everyonecodes.week3_spring_web.basic_types;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class TextEndpoint {

    @GetMapping("/text")
    String getText() {
        return "Text";
    }
}

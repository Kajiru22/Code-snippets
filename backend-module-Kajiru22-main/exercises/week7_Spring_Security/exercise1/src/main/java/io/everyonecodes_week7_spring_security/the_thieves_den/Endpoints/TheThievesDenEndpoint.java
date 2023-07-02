package io.everyonecodes_week7_spring_security.the_thieves_den.Endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TheThievesDenEndpoint {


    @GetMapping
    String get() {
        return "One Thousand and One Nights";
    }

}


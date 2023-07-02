package io.everyonecodes.week4_spring_web2.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeEndpoint {

    @GetMapping
    public String getHome() {
        return "Kansas";
    }
}

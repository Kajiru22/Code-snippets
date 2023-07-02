package io.everyonecodes.week4_spring_web2.polo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/polo")
public class PoloEndpoint {

    private final Polo polo;

    public PoloEndpoint(Polo polo) {
        this.polo = polo;
    }

    @PostMapping()
    public String post(@RequestBody String message) {
        return polo.send(message);
    }
}

package io.everyonecodes.week4_Spring_web2.dorothy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dorothy")
public class DorothyEndpoint {

    private final Dorothy dorothy;

    public DorothyEndpoint(Dorothy dorothy) {
        this.dorothy = dorothy;
    }

    @GetMapping
    public String getHome() {
        return dorothy.interact();
    }
}

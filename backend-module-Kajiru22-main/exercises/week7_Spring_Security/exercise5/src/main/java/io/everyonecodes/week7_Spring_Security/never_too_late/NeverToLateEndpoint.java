package io.everyonecodes.week7_Spring_Security.never_too_late;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NeverToLateEndpoint {

    private final NeverToLateService neverToLateService;

    public NeverToLateEndpoint(NeverToLateService neverToLateService) {
        this.neverToLateService = neverToLateService;
    }

    @GetMapping
    public String message() {
        return neverToLateService.message();
    }
}

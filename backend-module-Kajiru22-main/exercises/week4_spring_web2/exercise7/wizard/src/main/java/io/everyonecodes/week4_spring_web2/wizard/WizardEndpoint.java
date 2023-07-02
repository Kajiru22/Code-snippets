package io.everyonecodes.week4_spring_web2.wizard;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wizard")
public class WizardEndpoint {

    private final String url;

    public WizardEndpoint(@Value("${url}")String url) {
        this.url = url;
    }


    @GetMapping
    public String getHome() {
        return url;
    }
}

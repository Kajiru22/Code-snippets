package io.everyonecodes.week4_spring_web2.lorem_ipsum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class LoremIpsumEndpoint {

    private final RestTemplate restTemplate;

    public LoremIpsumEndpoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/loremIpsum")
    public String getLoremIpsum() {
        String url = "https://loripsum.net/api";
        return restTemplate.getForObject(url, String.class);
    }


}

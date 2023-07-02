package io.everyonecodes.week4_spring_web2.marco;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class PoloClient {
    private final RestTemplate template;

    public PoloClient(RestTemplate template) {
        this.template = template;
    }

    public String send(String message) {
        String url = "http://localhost:9001/polo";
        return template.postForObject(url, message, String.class);
    }
}

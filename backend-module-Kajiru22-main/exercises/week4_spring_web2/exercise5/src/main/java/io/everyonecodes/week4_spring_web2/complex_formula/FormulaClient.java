package io.everyonecodes.week4_spring_web2.complex_formula;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FormulaClient {

    private final RestTemplate restTemplate;

    private final String url = "http://localhost:8080/formula/";

    public FormulaClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public int interact(int number) {
        return restTemplate.postForObject(url, number, int.class);
    }
}
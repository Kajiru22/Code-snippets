package io.everyonecodes.week4_spring_web2.mocky;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/mocky/postcards")
public class MockyPostcardsEndpoint {

    private final RestTemplate template;
    private final String postcard1;
    private final String postcard2;


    public MockyPostcardsEndpoint(RestTemplate template, @Value("${urls.postcard1}") String postcard1,
                                  @Value("${urls.postcard2}") String postcard2) {
        this.template = template;
        this.postcard1 = postcard1;
        this.postcard2 = postcard2;
    }

    @GetMapping("/1")
    public Postcard getPostcard1() {
        return template.getForObject(postcard1, Postcard.class);
    }

    @GetMapping("/2")
    public Postcard getPostcard2() {
        return template.getForObject(postcard2, Postcard.class);
    }
}

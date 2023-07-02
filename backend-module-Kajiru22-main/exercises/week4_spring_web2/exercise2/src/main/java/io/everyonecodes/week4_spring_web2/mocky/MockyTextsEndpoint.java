package io.everyonecodes.week4_spring_web2.mocky;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/mocky/texts")
public class MockyTextsEndpoint {

    private final RestTemplate template;

    private final String url1;
    private final String url2;


    public MockyTextsEndpoint(RestTemplate template, @Value("${urls.string}") String url1,
                              @Value("${urls.stringCollection}") String url2) {
        this.template = template;
        this.url1 = url1;
        this.url2 = url2;
    }


    @GetMapping("/1")
    public String getMockyText1() {
        return template.getForObject(url1, String.class);
    }

    @GetMapping("/2")
    public String[] getMockyText2() {
        return template.getForObject(url2, String[].class);
    }

}

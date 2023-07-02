package io.everyonecodes.week4_spring_web2.mocky;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    public RestTemplate configuration() {
        return new RestTemplate();
    }
}

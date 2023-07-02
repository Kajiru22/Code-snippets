package io.everyonecodes.week4_spring_web2.marco;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    RestTemplate template() {
        return new RestTemplate();
    }
}

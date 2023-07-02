package io.everyonecodes.week5_evaluation.catalogue.Configuration;

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
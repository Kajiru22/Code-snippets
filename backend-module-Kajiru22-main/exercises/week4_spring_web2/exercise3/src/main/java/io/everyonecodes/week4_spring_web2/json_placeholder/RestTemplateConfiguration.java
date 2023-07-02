package io.everyonecodes.week4_spring_web2.json_placeholder;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class RestTemplateConfiguration {

    @Bean
    RestTemplate template() {
        return new RestTemplate();
    }
}

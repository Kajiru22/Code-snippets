package io.everyonecodes.week2_properties.threepwood_cinema;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ConfigurationProperties("cinema.specialoffer")

public class TemplateConfiguration {
    @Bean
    private List<Template> templates() {
        return templates();
    }

    public TemplateConfiguration() {
    }
}

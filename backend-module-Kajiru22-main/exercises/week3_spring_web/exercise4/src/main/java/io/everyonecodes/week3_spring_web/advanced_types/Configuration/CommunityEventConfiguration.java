package io.everyonecodes.week3_spring_web.advanced_types.Configuration;

import io.everyonecodes.week3_spring_web.advanced_types.Data_classes.CommunityEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("education")

public class CommunityEventConfiguration {

    private List<CommunityEvent> events;


    @Bean
    List<CommunityEvent> events() {
        return events;
    }

    public void setEvents(List<CommunityEvent> events) {
        this.events = events;
    }
}

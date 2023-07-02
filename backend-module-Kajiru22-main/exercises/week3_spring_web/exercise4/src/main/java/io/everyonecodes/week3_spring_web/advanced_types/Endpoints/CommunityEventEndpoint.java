package io.everyonecodes.week3_spring_web.advanced_types.Endpoints;

import io.everyonecodes.week3_spring_web.advanced_types.Data_classes.CommunityEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
public class CommunityEventEndpoint {

    private List<CommunityEvent> events;

    public CommunityEventEndpoint(List<CommunityEvent> events) {
        this.events = events;
    }

    @GetMapping
    List<CommunityEvent> getEvent() {
        return events;
    }
}

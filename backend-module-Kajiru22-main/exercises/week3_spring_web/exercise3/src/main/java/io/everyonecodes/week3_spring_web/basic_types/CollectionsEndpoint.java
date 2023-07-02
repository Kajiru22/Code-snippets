package io.everyonecodes.week3_spring_web.basic_types;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/collections")

public class CollectionsEndpoint {

    @GetMapping("/text")
    List<String> getText() {
        return List.of("a", "b", "c");
    }

    @GetMapping("/numbers")
    List<Integer> getNumbers() {
        return List.of(1, 2, 3);
    }

    @GetMapping("/choices")
    Map<String, Boolean> getChoices() {
        Map<String, Boolean> choices;
        choices = new HashMap<String, Boolean>(Map.of("do this", true, "do that", false));
        return choices;
    }

}

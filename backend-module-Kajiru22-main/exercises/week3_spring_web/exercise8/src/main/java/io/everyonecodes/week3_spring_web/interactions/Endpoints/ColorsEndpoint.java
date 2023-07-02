package io.everyonecodes.week3_spring_web.interactions.Endpoints;

import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/colors")
public class ColorsEndpoint {

    Set<String> colors = new HashSet<>();

    @GetMapping
    Set<String> getColors() {
        return colors;

    }
    @GetMapping("/{name}")
    String color(@PathVariable String name) {
        if(colors.contains(name)) {
            return name;
        } else {
            return "The color is not available in the app";
        }
    }
    @PutMapping("/{target}")
    String addColor(@PathVariable String target, @RequestBody String replacement) {
        colors.remove(target);
        colors.add(replacement);
        return replacement;
    }
    @DeleteMapping
    void deleteAll() {
        colors.clear();
    }
    @DeleteMapping("/{name}")
    void delete(@PathVariable String name) {
        colors.remove(name);
    }
}

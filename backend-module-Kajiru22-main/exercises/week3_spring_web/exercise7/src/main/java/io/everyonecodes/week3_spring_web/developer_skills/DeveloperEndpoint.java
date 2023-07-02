package io.everyonecodes.week3_spring_web.developer_skills;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/developers")
public class DeveloperEndpoint {

    private final DeveloperService developerService;

    public DeveloperEndpoint(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @GetMapping
    List<Developer> developers() {
        return developerService.findAll();
    }

    @GetMapping("/skills/{skill}")
    List<Developer> filteredDevelopers(@PathVariable String skill) {
        return developerService.findBy(skill);
    }
}

package io.everyonecodes.week3_spring_web.developer_skills;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@ConfigurationProperties("/")
public class DeveloperService {


    private List<Developer> developers;

    public List<Developer> findAll() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public List<Developer> findBy(String skill) {
        var skills = List.of(skill.split(" "));
        return developers.stream().
                filter(e -> e.getSkills()
                        .containsAll(skills))
                .collect(Collectors.toList());
    }
}
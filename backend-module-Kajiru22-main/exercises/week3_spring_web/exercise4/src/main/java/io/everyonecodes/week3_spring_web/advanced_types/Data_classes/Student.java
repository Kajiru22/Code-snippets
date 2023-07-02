package io.everyonecodes.week3_spring_web.advanced_types.Data_classes;

import java.util.Set;

public class Student {

    private String name;
    private Set<String> language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getLanguage() {
        return language;
    }

    public void setLanguage(Set<String> language) {
        this.language = language;
    }
}

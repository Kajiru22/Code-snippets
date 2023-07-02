package io.everyonecodes.week3_spring_web.advanced_types.Data_classes;

import io.everyonecodes.week3_spring_web.advanced_types.Data_classes.Student;

import java.util.Set;

public class CommunityEvent {

    private String name;
    private String location;
    private Set<Student> students;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}

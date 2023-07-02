package io.everyonecodes.booster.evaluation.registrations.presistance.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;
import java.util.Objects;

public class UdemyUser {
    @Id
    private String id;
    private String username;

    @DBRef
    private List<Course> courses;

    public UdemyUser(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public UdemyUser() {
    }

    public UdemyUser(List<Course> courses) {
        this.courses = courses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UdemyUser udemyUser = (UdemyUser) o;
        return Objects.equals(id, udemyUser.id) && Objects.equals(username, udemyUser.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }

    @Override
    public String toString() {
        return "UdemyUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

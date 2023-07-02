package io.everyonecodes.booster.evaluation.registrations.presistance.domain;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class Course {

    @Id
    private String id;

    private int identifier;

    private String name;

    private int price;

    public Course(int identifier, String name, int price) {
        this.identifier = identifier;
        this.name = name;
        this.price = price;
    }

    public Course() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return price == course.price && Objects.equals(id, course.id) && Objects.equals(identifier, course.identifier) && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identifier, name, price);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", identifier=" + identifier +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

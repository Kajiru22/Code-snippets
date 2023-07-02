package io.everyonecodes.booster.evaluation.registrations.presistance.domain;

import java.util.Objects;
import java.util.UUID;

public class Registration {

    private String userId;

    private String username;

    private String courseId;

    private String courseName;

    private UUID identifier;

    private int price;

    public Registration(String userId, String username, String courseId, String courseName, UUID identifier, int price) {
        this.userId = userId;
        this.username = username;
        this.courseId = courseId;
        this.courseName = courseName;
        this.identifier = identifier;
        this.price = price;
    }

    public Registration() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
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
        Registration that = (Registration) o;
        return price == that.price && Objects.equals(userId, that.userId) && Objects.equals(username, that.username) && Objects.equals(courseId, that.courseId) && Objects.equals(courseName, that.courseName) && Objects.equals(identifier, that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, courseId, courseName, identifier, price);
    }

    @Override
    public String toString() {
        return "Registration{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", identifier=" + identifier +
                ", price=" + price +
                '}';
    }
}

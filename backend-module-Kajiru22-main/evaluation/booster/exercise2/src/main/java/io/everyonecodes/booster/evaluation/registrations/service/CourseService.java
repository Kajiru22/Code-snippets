package io.everyonecodes.booster.evaluation.registrations.service;

import io.everyonecodes.booster.evaluation.registrations.presistance.domain.Course;
import io.everyonecodes.booster.evaluation.registrations.presistance.repository.CourseRepository;

import java.util.List;
import java.util.NoSuchElementException;

public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(String courseId) {
        return courseRepository.findById(courseId)
                .orElseThrow(() -> new NoSuchElementException("Course not found with ID: " + courseId));
    }

    public boolean existsById(String id) {
        return courseRepository.existsById(id);
    }
}

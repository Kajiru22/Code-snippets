package io.everyonecodes.booster.evaluation.registrations.service;

import io.everyonecodes.booster.evaluation.registrations.presistance.domain.Course;
import io.everyonecodes.booster.evaluation.registrations.presistance.domain.Registration;
import io.everyonecodes.booster.evaluation.registrations.presistance.domain.UdemyUser;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class RegistrationService {

    private final CourseService courseService;
    private final UdemyUserService udemyUserService;

    public RegistrationService(CourseService courseService, UdemyUserService udemyUserService) {
        this.courseService = courseService;
        this.udemyUserService = udemyUserService;
    }

    public Registration saveUserAndCourse(Registration registration) {

        if(!courseService.existsById(registration.getCourseId())) {
            int identifier = Integer.valueOf(UUID.randomUUID());
            Course course = new Course();
            course.setId(registration.getCourseId());
            course.setIdentifier();
            course.setName(registration.getCourseName());
            course.setPrice(registration.getPrice());
            courseService.saveCourse(course);
            UdemyUser udemyUser = new UdemyUser();
            udemyUser.setUsername(registration.getUsername());
            udemyUser.getCourses().add(course);
            udemyUserService.saveUser(udemyUser);
        }
        else {
            System.out.println("course and user all ready exits!");
        }
        return registration;
    }
}

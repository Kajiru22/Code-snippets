package io.everyonecodes.booster.evaluation.registrations.endpoint;

import io.everyonecodes.booster.evaluation.registrations.presistance.domain.Course;
import io.everyonecodes.booster.evaluation.registrations.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/courses")
public class CourseEndpoint {

    private final CourseService courseService;

    public CourseEndpoint(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping
    public List<Course> getAll() {
        return courseService.getAllCourses();
    }
}

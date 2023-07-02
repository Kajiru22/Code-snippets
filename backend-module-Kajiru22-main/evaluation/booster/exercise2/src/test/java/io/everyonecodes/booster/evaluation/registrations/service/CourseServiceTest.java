package io.everyonecodes.booster.evaluation.registrations.service;

import io.everyonecodes.booster.evaluation.registrations.presistance.domain.Course;
import io.everyonecodes.booster.evaluation.registrations.presistance.repository.CourseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CourseServiceTest {

    @Mock
    private CourseRepository courseRepository;
    private CourseService courseService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        courseService = new CourseService(courseRepository);
    }

    @Test
    void saveCourse() {

        Course course = new Course(1234567, "english", 250);
        when(courseRepository.save(course)).thenReturn(course);

        Course savedCourse = courseService.saveCourse(course);

        assertNotNull(savedCourse);
        assertEquals(course.getId(), savedCourse.getId());
        assertEquals(course.getName(), savedCourse.getName());
        assertEquals(course.getIdentifier(), savedCourse.getIdentifier());
        assertEquals(course.getPrice(), savedCourse.getPrice());

        verify(courseRepository, times(1)).save(course);
    }

    @Test
    void getAllCourses() {

        int uuid1 = 123456543;
        int uuid2 = 142567876;
        List<Course> courses = List.of(
                new Course(uuid1, "English",  10),
                new Course(uuid2, "Math",  15)
        );
        when(courseRepository.findAll()).thenReturn(courses);

        List<Course> retrievedCourses = courseService.getAllCourses();

        assertNotNull(retrievedCourses);
        assertEquals(courses.size(), retrievedCourses.size());
        assertEquals(courses, retrievedCourses);

        verify(courseRepository, times(1)).findAll();
    }


    @Test
    void getCourseById_nonExistingId_shouldThrowNoSuchElementException() {
        String courseId = "1";
        when(courseRepository.findById(courseId)).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> courseService.getCourseById(courseId));

        verify(courseRepository, times(1)).findById(courseId);
    }

    @Test
    void existsById_existingId_shouldReturnTrue() {
        String courseId = "1";
        when(courseRepository.existsById(courseId)).thenReturn(true);

        boolean exists = courseService.existsById(courseId);

        assertTrue(exists);

        verify(courseRepository, times(1)).existsById(courseId);
    }

    @Test
    void existsById_nonExistingId_shouldReturnFalse() {
        String courseId = "1";
        when(courseRepository.existsById(courseId)).thenReturn(false);

        boolean exists = courseService.existsById(courseId);

        assertFalse(exists);

        verify(courseRepository, times(1)).existsById(courseId);
    }
}
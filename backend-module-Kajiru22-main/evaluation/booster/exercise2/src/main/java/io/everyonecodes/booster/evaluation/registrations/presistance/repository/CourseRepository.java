package io.everyonecodes.booster.evaluation.registrations.presistance.repository;

import io.everyonecodes.booster.evaluation.registrations.presistance.domain.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {

    boolean existsById(String id);
}

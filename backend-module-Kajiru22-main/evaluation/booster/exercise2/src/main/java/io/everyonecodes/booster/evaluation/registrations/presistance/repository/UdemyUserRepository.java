package io.everyonecodes.booster.evaluation.registrations.presistance.repository;

import io.everyonecodes.booster.evaluation.registrations.presistance.domain.UdemyUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UdemyUserRepository extends MongoRepository<UdemyUser, String> {

    Optional<UdemyUser> findByUsername(String username);
}

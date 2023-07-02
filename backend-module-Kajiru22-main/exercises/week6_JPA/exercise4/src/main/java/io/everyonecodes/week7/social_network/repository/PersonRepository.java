package io.everyonecodes.week7.social_network.repository;

import io.everyonecodes.week7.social_network.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

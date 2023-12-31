package io.everyonecodes.booster.evaluation.udemy_users.presitance.repository;

import io.everyonecodes.booster.evaluation.udemy_users.presitance.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByUsername(String username);

    boolean existsByUsername(String username);
}

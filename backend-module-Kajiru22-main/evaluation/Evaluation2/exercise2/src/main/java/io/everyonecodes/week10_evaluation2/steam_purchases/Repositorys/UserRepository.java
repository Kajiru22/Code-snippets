package io.everyonecodes.week10_evaluation2.steam_purchases.Repositorys;

import io.everyonecodes.week10_evaluation2.steam_purchases.Data.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}

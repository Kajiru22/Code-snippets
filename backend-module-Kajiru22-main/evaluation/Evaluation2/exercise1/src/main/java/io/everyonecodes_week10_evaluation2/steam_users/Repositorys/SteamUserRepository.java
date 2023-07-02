package io.everyonecodes_week10_evaluation2.steam_users.Repositorys;

import io.everyonecodes_week10_evaluation2.steam_users.Data.SteamUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SteamUserRepository extends MongoRepository<SteamUser, String> {
    Optional<SteamUser> findByUsernameIgnoreCase(String username);
}

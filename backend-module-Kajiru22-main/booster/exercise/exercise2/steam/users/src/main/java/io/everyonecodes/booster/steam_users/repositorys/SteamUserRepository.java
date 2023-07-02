package io.everyonecodes.booster.steam_users.repositorys;

import io.everyonecodes.booster.steam_users.data.SteamUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SteamUserRepository extends MongoRepository<SteamUser, String> {

    Optional<SteamUser> findOneByName(String username);
    boolean existsByUsername(String username);
}

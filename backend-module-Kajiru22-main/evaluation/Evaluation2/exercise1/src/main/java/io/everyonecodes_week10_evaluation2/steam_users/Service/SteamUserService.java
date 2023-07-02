package io.everyonecodes_week10_evaluation2.steam_users.Service;
import io.everyonecodes_week10_evaluation2.steam_users.Data.SteamUser;
import io.everyonecodes_week10_evaluation2.steam_users.Repositorys.SteamUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SteamUserService {

    private final SteamUserRepository steamUserRepository;

    private final PasswordEncoder passwordEncoder;

    public SteamUserService(SteamUserRepository steamUserRepository, PasswordEncoder passwordEncoder) {
        this.steamUserRepository = steamUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public SteamUser create(SteamUser user) {
        user.setAuthorities(Set.of("ROLE_USER"));
        String password = user.getPassword();
        String encodedPassword = passwordEncoder.encode(password);
        user.setPassword(encodedPassword);
        return steamUserRepository.save(user);
    }
}

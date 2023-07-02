package io.everyonecodes_week10_evaluation2.steam_users.Endpoints;

import io.everyonecodes_week10_evaluation2.steam_users.Data.SteamUser;
import io.everyonecodes_week10_evaluation2.steam_users.Repositorys.SteamUserRepository;
import io.everyonecodes_week10_evaluation2.steam_users.Service.SteamUserService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SteamUserEndpoint {
    private final SteamUserRepository steamUserRepository;
    private final SteamUserService steamUserService;

    public SteamUserEndpoint(SteamUserRepository steamUserRepository, SteamUserService steamUserService) {
        this.steamUserRepository = steamUserRepository;
        this.steamUserService = steamUserService;
    }

    @PostMapping("/users")
    @Secured("ROLE_APP")
    public SteamUser createUser(SteamUser steamUser) {
        return steamUserService.create(steamUser);
    }

    @PostMapping("/login")
    @Secured("ROLE_USER")
    public String login(@RequestBody String name, String password) {
        var user = steamUserRepository.findByUsernameIgnoreCase(name);
        if(user.get().getUsername().equals(name) && user.get().getPassword().equals(password)) {
            return "Login successful";
        }
        else {
            return "wrong username or password";
        }
    }
}

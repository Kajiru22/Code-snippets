package io.everyonecodes.booster.steam_users.endpoints;

import io.everyonecodes.booster.steam_users.data.SteamUser;
import io.everyonecodes.booster.steam_users.service.SteamUserService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class SteamUserEndpoint {

    private final SteamUserService steamUserService;

    public SteamUserEndpoint(SteamUserService steamUserService) {
        this.steamUserService = steamUserService;
    }

}

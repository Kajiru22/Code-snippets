package io.everyonecodes.booster.steam_users.service;

import io.everyonecodes.booster.steam_users.data.SteamUser;
import io.everyonecodes.booster.steam_users.repositorys.SteamUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SteamUserService {

    private final SteamUserRepository steamUserRepository;
    private final PasswordEncoder passwordEncoder;

    public SteamUserService(SteamUserRepository steamUserRepository, PasswordEncoder passwordEncoder) {
        this.steamUserRepository = steamUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    /*public Optional<SteamUser> saveUser(SteamUser user) {
        Optional<SteamUser> oUser = steamUserRepository.findOneByName(user.getusername());
        oUser.get().setPassword(passwordEncoder.encode(user.getPassword()));
        oUser.get().setusername(user.getusername()); // todo ask for username
        oUser.get().setAuthorities();
    }*/
}
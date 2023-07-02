package io.everyonecodes.booster.evaluation.registrations.service;

import io.everyonecodes.booster.evaluation.registrations.presistance.domain.UdemyUser;
import io.everyonecodes.booster.evaluation.registrations.presistance.repository.UdemyUserRepository;

import java.util.List;
import java.util.NoSuchElementException;

public class UdemyUserService {

    private final UdemyUserRepository udemyUserRepository;

    public UdemyUserService(UdemyUserRepository udemyUserRepository) {
        this.udemyUserRepository = udemyUserRepository;
    }

    public UdemyUser saveUser(UdemyUser user) {
        return udemyUserRepository.save(user);
    }

    public List<UdemyUser> getAllUsers() {
        return udemyUserRepository.findAll();
    }

    public UdemyUser getUserById(String userId) {
        return udemyUserRepository.findById(userId)
                .orElseThrow(() -> new NoSuchElementException("User not found with ID: " + userId));
    }

    public UdemyUser getUserByUsername(String username) {
        return udemyUserRepository.findByUsername(username)
                .orElseThrow(() -> new NoSuchElementException("User not found with username: " + username));
    }
}

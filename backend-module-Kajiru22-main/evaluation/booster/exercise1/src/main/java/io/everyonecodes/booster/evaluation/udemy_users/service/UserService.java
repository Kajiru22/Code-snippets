package io.everyonecodes.booster.evaluation.udemy_users.service;

import io.everyonecodes.booster.evaluation.udemy_users.presitance.domain.User;
import io.everyonecodes.booster.evaluation.udemy_users.presitance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
@Service
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final String role;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, @Value("${role}") String role) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.role = role;
    }

    public User addUser(User user) {
        User user1 = new User();
        user1.setAuthorities(Collections.singleton(role));
        user1.setPassword(passwordEncoder.encode(user.getPassword()));
        user1.setUsername(user.getUsername());
        return userRepository.save(user1);
    }

    public void deleteUser(String name) {
        var user = userRepository.findOneByUsername(name);
        userRepository.delete(user.get());
        System.out.println("User " + user.get().getUsername() + " has been deleted from database.");
    }
}

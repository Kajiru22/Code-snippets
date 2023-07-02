package io.everyonecodes.booster.evaluation.udemy_users.service;

import io.everyonecodes.booster.evaluation.udemy_users.presitance.domain.User;
import io.everyonecodes.booster.evaluation.udemy_users.presitance.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserServiceTest {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private UserService userService;

    @BeforeEach
    void setUp() {
        userRepository = mock(UserRepository.class);
        passwordEncoder = mock(PasswordEncoder.class);
        userService = new UserService(userRepository, passwordEncoder, "ROLE_USER");
    }

    @Test
    void addUser_SavesUserWithEncodedPasswordAndAuthorities() {
        // Arrange
        User user = new User();
        user.setUsername("john");
        user.setPassword("password");

        when(passwordEncoder.encode("password")).thenReturn("encodedPassword");
        when(userRepository.save(any(User.class))).thenAnswer(invocation -> invocation.getArgument(0));

        // Act
        User savedUser = userService.addUser(user);

        // Assert
        assertEquals("john", savedUser.getUsername());
        assertEquals(Collections.singleton("ROLE_USER"), savedUser.getAuthorities());
        assertEquals("encodedPassword", savedUser.getPassword());
        verify(passwordEncoder).encode("password"); // Verify that the encode method was called with the correct password
        verify(userRepository).save(any(User.class)); // Verify that the save method was called with any User object
    }

    @Test
    void deleteUser_DeletesUserFromRepository() {
        // Arrange
        String username = "john";
        User user = new User();
        user.setUsername(username);
        when(userRepository.findOneByUsername(username)).thenReturn(Optional.of(user));

        // Act
        userService.deleteUser(username);

        // Assert
        verify(userRepository).findOneByUsername(username); // Verify that the findOneByUsername method was called
        verify(userRepository).delete(user); // Verify that the delete method was called with the correct user
    }
}

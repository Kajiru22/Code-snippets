package io.everyonecodes.booster.evaluation.udemy_users.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LoginServiceTest {

    @Value("${message}")
    private String message;

    @Test
    void getMessage_ReturnsConfiguredMessage() {
        // Arrange
        LoginService loginService = new LoginService(message);

        // Act
        String actualMessage = loginService.getMessage();

        // Assert
        assertEquals(message, actualMessage);
    }
}

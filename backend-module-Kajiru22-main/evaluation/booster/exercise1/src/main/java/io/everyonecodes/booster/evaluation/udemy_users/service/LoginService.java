package io.everyonecodes.booster.evaluation.udemy_users.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final String message;


    public LoginService(@Value("${message}") String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

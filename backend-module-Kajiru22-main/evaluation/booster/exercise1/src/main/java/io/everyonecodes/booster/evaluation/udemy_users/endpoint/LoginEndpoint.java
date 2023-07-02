package io.everyonecodes.booster.evaluation.udemy_users.endpoint;

import io.everyonecodes.booster.evaluation.udemy_users.service.LoginService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginEndpoint {

    private final LoginService loginService;

    public LoginEndpoint(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    @Secured("ROLE_STUDENT")
    public String login() {
        return loginService.getMessage();
    }
}

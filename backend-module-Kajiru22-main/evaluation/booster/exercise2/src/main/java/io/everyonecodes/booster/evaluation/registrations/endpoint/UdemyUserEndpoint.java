package io.everyonecodes.booster.evaluation.registrations.endpoint;

import io.everyonecodes.booster.evaluation.registrations.presistance.domain.UdemyUser;
import io.everyonecodes.booster.evaluation.registrations.service.UdemyUserService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UdemyUserEndpoint {

    private final UdemyUserService udemyUserService;

    public UdemyUserEndpoint(UdemyUserService udemyUserService) {
        this.udemyUserService = udemyUserService;
    }

    @GetMapping
    @Secured("ROLE_ADMIN")
    public List<UdemyUser> getAllUsers() {
        return udemyUserService.getAllUsers();
    }
}

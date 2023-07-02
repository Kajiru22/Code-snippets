package io.everyonecodes.booster.evaluation.registrations.endpoint;

import io.everyonecodes.booster.evaluation.registrations.presistance.domain.Registration;
import io.everyonecodes.booster.evaluation.registrations.service.RegistrationService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registrations")
public class RegistrationEndpoint {

    private final RegistrationService registrationService;

    public RegistrationEndpoint(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    @Secured("ROLE_APP")
    public Registration createUserAndCourse(Registration registration) {
        return registrationService.saveUserAndCourse(registration);
    }
}

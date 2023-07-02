package io.everyonecodes_week7_spring_security_language_barriers.Endpoints;

import io.everyonecodes_week7_spring_security_language_barriers.Service.LanguageShoolService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LanguageShoolEndpoint {

    private final LanguageShoolService languageShoolService;

    public LanguageShoolEndpoint(LanguageShoolService languageShoolService) {
        this.languageShoolService = languageShoolService;
    }

    @GetMapping
    public String shool() {
        return "Online Language School";
    }

    @GetMapping("/languages")
    @Secured("ROLE_USER")
    public String languages() {
        return "Our available languages are German and English.";
    }

    @GetMapping("/languages/german")
    @Secured("ROLE_LANGUAGE_GERMAN")
    public String german() {
        languageShoolService.count();
        return "Willkommen";
    }

    @GetMapping("/languages/english")
    @Secured("ROLE_LANGUAGE_ENGLISH")
    public String english() {
        languageShoolService.count();
        return "Welcome";
    }
    @GetMapping("/interactions")
    @Secured("ROLE_ADMIN")
    public int interactions() {
        return languageShoolService.showCounter();
    }
}

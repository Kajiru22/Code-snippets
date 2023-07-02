package io.everyonecodes.week3_spring_web.advanced_types.Endpoints;

import io.everyonecodes.week3_spring_web.advanced_types.Data_classes.Academy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/academies")

public class AcademyEndpoint {

    private List<Academy> academies;

    public AcademyEndpoint(List<Academy> academies) {
        this.academies = academies;
    }

    @GetMapping
    List<Academy> getAcademy() {
        return academies;
    }
}

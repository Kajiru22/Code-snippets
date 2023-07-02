package io.everyonecodes.week3_spring_web.drhouse_admission.Endpoints;

import io.everyonecodes.week3_spring_web.drhouse_admission.Data_Classes.Patient;
import io.everyonecodes.week3_spring_web.drhouse_admission.Service_Classes.Admission;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientEndpoint {
    private final Admission admission;

    public PatientEndpoint(Admission admission) {
        this.admission = admission;
    }

    @PostMapping
    public Patient admitPatient(@RequestBody Patient patient) {
        return admission.admit(patient);
    }
}




package io.everyonecodes.week3_spring_web.drhouse_admission.Service_Classes;

import io.everyonecodes.week3_spring_web.drhouse_admission.Data_Classes.Patient;
import org.springframework.stereotype.Service;

@Service
public class Admission {
    private final UUIDProvider uuidProvider;

    public Admission(UUIDProvider uuidProvider) {
        this.uuidProvider = uuidProvider;
    }

    public Patient admit(Patient patient) {
        uuidProvider.provideUUID(patient);
        return patient;
    }
}
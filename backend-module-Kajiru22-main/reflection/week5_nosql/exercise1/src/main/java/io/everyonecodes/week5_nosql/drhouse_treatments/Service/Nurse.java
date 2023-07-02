package io.everyonecodes.week5_nosql.drhouse_treatments.Service;

import io.everyonecodes.week5_nosql.drhouse_treatments.Data.Patient;
import org.springframework.stereotype.Service;

@Service
public class Nurse {
    public String applyTreatment(Patient patient) {
        String treatment = "Spend one day in the hospital bed";
        return treatment;
    }
}
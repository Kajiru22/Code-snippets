package iio.everyonecodes.week4_reflection.drhouse_diagnoses.Service;

import iio.everyonecodes.week4_reflection.drhouse_diagnoses.Data.Patient;
import org.springframework.stereotype.Service;

@Service
public class DiagnosisRoom {

    private final DrHouse drHouse;

    public DiagnosisRoom(DrHouse drHouse) {
        this.drHouse = drHouse;
    }

    public Patient diagnose(Patient patient) {
        drHouse.diagnose(patient);
        System.out.println("Patient with the symptoms: " + patient.getSymptoms() + ", diagnosed with: " + patient.getDiagnosis());
        return patient;
    }
}

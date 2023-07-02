package iio.everyonecodes.week4_reflection.drhouse_diagnoses.Service;

import iio.everyonecodes.week4_reflection.drhouse_diagnoses.Data.Diagnosis;
import iio.everyonecodes.week4_reflection.drhouse_diagnoses.Data.Patient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DrHouse {

    private final List<Diagnosis> diagnoses;

    public DrHouse(@Qualifier("list") List<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public Patient diagnose(Patient patient) {
        for (Diagnosis diagnosis : diagnoses) {
            if (patient.getSymptoms().contains(diagnosis.getSymptoms())) {
                patient.setDiagnosis(diagnosis.getName());
            }
        }
        if(patient.getDiagnosis() == (null)) {
            patient.setDiagnosis("lupus");
        }
        return patient;
    }
}

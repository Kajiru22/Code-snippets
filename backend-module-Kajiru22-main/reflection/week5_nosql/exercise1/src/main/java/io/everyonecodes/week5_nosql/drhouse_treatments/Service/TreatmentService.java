package io.everyonecodes.week5_nosql.drhouse_treatments.Service;

import io.everyonecodes.week5_nosql.drhouse_treatments.Data.Patient;
import io.everyonecodes.week5_nosql.drhouse_treatments.Data.Treatment;
import io.everyonecodes.week5_nosql.drhouse_treatments.Repositorys.TreatmentRepository;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class TreatmentService {

    private final TreatmentRepository treatmentRepository;
    private final Nurse nurse;

    public TreatmentService(TreatmentRepository treatmentRepository, Nurse nurse) {
        this.treatmentRepository = treatmentRepository;
        this.nurse = nurse;
    }

    public Treatment createTreatment(Patient patient) {
        patient.setTreatment(nurse.applyTreatment(patient));
        Treatment treatment = new Treatment(patient.getUuid(),
                patient.getName(),
                patient.getSymptoms(),
                patient.getDiagnosis(),
                patient.getTreatment());
        return treatmentRepository.save(treatment);
    }

    public Treatment updateTreatment(String id, Patient patient) {
        Treatment existingTreatment = findTreatmentById(id);
        String diagnosis = patient.getDiagnosis();
        String treatment = nurse.applyTreatment(patient);
        existingTreatment.setSymptoms(patient.getSymptoms());
        existingTreatment.setDiagnosis(diagnosis);
        existingTreatment.setTreatment(treatment);
        return treatmentRepository.save(existingTreatment);
    }

    public Treatment findTreatmentById(String id) {
        return treatmentRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException(id));
    }

    public void deleteTreatmentById(String id) {
        treatmentRepository.deleteById(id);
    }
}




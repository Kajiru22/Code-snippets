package io.everyonecodes_week6_JPA.drhouse_accountancy.Service;

import io.everyonecodes_week6_JPA.drhouse_accountancy.Data.Patient;
import io.everyonecodes_week6_JPA.drhouse_accountancy.Data.PatientDTO;
import io.everyonecodes_week6_JPA.drhouse_accountancy.Repositorys.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Optional<Patient> getPatient(String uuid) {
        return patientRepository.findByUuid(uuid);
    }

    public void savePatient(PatientDTO patientDTO) {
        Patient patient = new Patient(patientDTO.getUuid(),
                patientDTO.getName(),
                patientDTO.getSymptoms(),
                patientDTO.getDiagnosis(),
                patientDTO.getTreatment());
        patientRepository.save(patient);
    }
}

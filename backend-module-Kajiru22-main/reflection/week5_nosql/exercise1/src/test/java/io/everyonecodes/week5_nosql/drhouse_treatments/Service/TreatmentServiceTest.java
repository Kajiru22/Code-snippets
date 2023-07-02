package io.everyonecodes.week5_nosql.drhouse_treatments.Service;
import io.everyonecodes.week5_nosql.drhouse_treatments.Data.Patient;
import io.everyonecodes.week5_nosql.drhouse_treatments.Data.Treatment;
import io.everyonecodes.week5_nosql.drhouse_treatments.Repositorys.TreatmentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.NoSuchElementException;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class TreatmentServiceTest {
    @Mock
    private TreatmentRepository treatmentRepository;
    @Mock
    private Nurse nurse;
    @InjectMocks
    private TreatmentService treatmentService;
    private Patient patient;


    @Test
    public void testCreateTreatment() {
        String expectedTreatment = "Take some rest";
        when(nurse.applyTreatment(any(Patient.class))).thenReturn(expectedTreatment);
        when(treatmentRepository.save(any(Treatment.class)))
                .thenReturn(new Treatment("1", "John Doe", "Fever", "Cold", expectedTreatment));
        Treatment actualTreatment = treatmentService.createTreatment(patient);
        assertNotNull(actualTreatment);
        assertEquals(expectedTreatment, actualTreatment.getTreatment());
    }

    @Test
    public void testUpdateTreatment() {
        Treatment existingTreatment =
                new Treatment("1", "John Doe", "Fever", "Cold", "Take some rest");
        String expectedDiagnosis = "Flu";
        String expectedTreatment = "Stay hydrated";
        when(nurse.applyTreatment(any(Patient.class))).thenReturn(expectedTreatment);
        when(treatmentRepository.findById(existingTreatment.getId())).thenReturn(Optional.of(existingTreatment));
        when(treatmentRepository.save(existingTreatment)).thenReturn(existingTreatment);
        patient.setDiagnosis(expectedDiagnosis);
        patient.setTreatment(expectedTreatment);
        Treatment actualTreatment = treatmentService.updateTreatment(existingTreatment.getId(), patient);
        assertNotNull(actualTreatment);
        assertEquals(expectedDiagnosis, actualTreatment.getDiagnosis());
        assertEquals(expectedTreatment, actualTreatment.getTreatment());
    }

    @Test
    public void testFindTreatmentById() {
        Treatment existingTreatment =
                new Treatment("1", "John Doe", "Fever", "Cold", "Take some rest");
        when(treatmentRepository.findById(existingTreatment.getId())).thenReturn(Optional.of(existingTreatment));
        Treatment actualTreatment = treatmentService.findTreatmentById(existingTreatment.getId());
        assertNotNull(actualTreatment);
        assertEquals(existingTreatment.getId(), actualTreatment.getId());
        assertEquals(existingTreatment.getName(), actualTreatment.getName());
        assertEquals(existingTreatment.getSymptoms(), actualTreatment.getSymptoms());
        assertEquals(existingTreatment.getDiagnosis(), actualTreatment.getDiagnosis());
        assertEquals(existingTreatment.getTreatment(), actualTreatment.getTreatment());
    }

    @Test
    public void testFindTreatmentByIdWithNoSuchElementException() {
        String invalidId = "2";
        when(treatmentRepository.findById(invalidId)).thenReturn(Optional.empty());
        assertThrows(NoSuchElementException.class, () -> {
            treatmentService.findTreatmentById(invalidId);
        });
    }
}

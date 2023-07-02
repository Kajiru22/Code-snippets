package io.everyonecodes.week3_spring_web.drhouse_admission.Service_Classes;

import io.everyonecodes.week3_spring_web.drhouse_admission.Data_Classes.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AdmissionTest {

    UUIDProvider uuidProvider = new UUIDProvider();
    Admission admission = new Admission(uuidProvider);

    @Test
    public void testAdmit() {
        Patient patient = new Patient("John Doe", "", "");
        Patient admittedPatient = admission.admit(patient);

        Assertions.assertNotNull(admittedPatient.getUuid());
    }
}

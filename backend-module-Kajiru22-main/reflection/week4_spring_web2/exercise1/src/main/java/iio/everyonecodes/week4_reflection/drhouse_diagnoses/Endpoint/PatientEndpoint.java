package iio.everyonecodes.week4_reflection.drhouse_diagnoses.Endpoint;

import iio.everyonecodes.week4_reflection.drhouse_diagnoses.Data.Patient;
import iio.everyonecodes.week4_reflection.drhouse_diagnoses.Service.DiagnosisRoom;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientEndpoint {

    private final DiagnosisRoom diagnosisRoom;

    public PatientEndpoint(DiagnosisRoom diagnosisRoom) {
        this.diagnosisRoom = diagnosisRoom;
    }

    @PostMapping
    public Patient diagnoses(@RequestBody Patient patient) {
       return diagnosisRoom.diagnose(patient);
    }
}

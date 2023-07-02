package io.everyonecodes.week5_nosql.drhouse_treatments.Endpoints;

import io.everyonecodes.week5_nosql.drhouse_treatments.Data.Patient;
import io.everyonecodes.week5_nosql.drhouse_treatments.Data.Treatment;
import io.everyonecodes.week5_nosql.drhouse_treatments.Service.TreatmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/treatments")
public class TreatmentEndpoint {

    private final TreatmentService treatmentService;

    public TreatmentEndpoint(TreatmentService treatmentService) {
        this.treatmentService = treatmentService;
    }

    @PostMapping
    public Treatment createTreatment(@RequestBody Patient patient) {
        return treatmentService.createTreatment(patient);
    }

    @PutMapping("/{id}")
    public Treatment updateTreatment(@PathVariable String id, @RequestBody Patient patient) {
        return treatmentService.updateTreatment(id, patient);
    }

    @GetMapping("/{id}")
    public Treatment getTreatmentById(@PathVariable String id) {
        return treatmentService.findTreatmentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTreatmentById(@PathVariable String id) {
        treatmentService.deleteTreatmentById(id);
    }
}

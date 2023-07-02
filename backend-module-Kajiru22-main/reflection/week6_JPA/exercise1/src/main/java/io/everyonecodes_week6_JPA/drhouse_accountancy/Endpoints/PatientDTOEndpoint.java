package io.everyonecodes_week6_JPA.drhouse_accountancy.Endpoints;

import io.everyonecodes_week6_JPA.drhouse_accountancy.Data.Invoice;
import io.everyonecodes_week6_JPA.drhouse_accountancy.Data.PatientDTO;
import io.everyonecodes_week6_JPA.drhouse_accountancy.Service.InvoiceService;
import io.everyonecodes_week6_JPA.drhouse_accountancy.Service.PatientDTOService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PatientDTOEndpoint {

    private final PatientDTOService patientDTOService;

    private final InvoiceService invoiceService;

    public PatientDTOEndpoint(PatientDTOService patientDTOService, InvoiceService invoiceService) {
        this.patientDTOService = patientDTOService;
        this.invoiceService = invoiceService;
    }

    @PostMapping("/patients")
    public PatientDTO createPatient(@RequestBody PatientDTO patientDTO) {
        var patient = patientDTOService.createNewPatient(patientDTO);
        patientDTOService.createInvoice(patientDTO);
        return patientDTO;
    }

    @GetMapping("/invoices")
    public List<Invoice> showAll() {
        return invoiceService.showAll();
    }

    @PutMapping("/invoices/{id}/paid")
    public void markAsPaid(@PathVariable Long id) {
        invoiceService.markAsPaid(id);
    }
}

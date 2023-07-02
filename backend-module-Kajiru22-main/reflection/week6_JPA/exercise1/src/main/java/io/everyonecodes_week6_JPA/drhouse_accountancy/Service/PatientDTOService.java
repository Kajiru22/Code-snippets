package io.everyonecodes_week6_JPA.drhouse_accountancy.Service;

import io.everyonecodes_week6_JPA.drhouse_accountancy.Data.Invoice;
import io.everyonecodes_week6_JPA.drhouse_accountancy.Data.Patient;
import io.everyonecodes_week6_JPA.drhouse_accountancy.Data.PatientDTO;
import io.everyonecodes_week6_JPA.drhouse_accountancy.Repositorys.InvoiceRepository;
import io.everyonecodes_week6_JPA.drhouse_accountancy.Repositorys.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PatientDTOService {

    private final PatientService patientService;
    private final InvoiceRepository invoiceRepository;

    public PatientDTOService(PatientService patientService, InvoiceRepository invoiceRepository) {
        this.patientService = patientService;
        this.invoiceRepository = invoiceRepository;
    }

    public Optional<Patient> createNewPatient(PatientDTO patientDTO) {
        if(patientService.getPatient(patientDTO.getUuid()).isEmpty()){
            patientService.savePatient(patientDTO);
        }
        return patientService.getPatient(patientDTO.getUuid());
    }

    public PatientDTO createInvoice(PatientDTO patientDTO) {
        Patient patient = createNewPatient(patientDTO).get();
        Invoice invoice = new Invoice(90.0, false, patient);
        invoiceRepository.save(invoice);
        return patientDTO;
    }
}

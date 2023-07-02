package io.everyonecodes_week6_JPA.drhouse_accountancy.Service;

import io.everyonecodes_week6_JPA.drhouse_accountancy.Data.Invoice;
import io.everyonecodes_week6_JPA.drhouse_accountancy.Repositorys.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public List<Invoice> showAll() {
        return invoiceRepository.findAll();
    }

    public void markAsPaid(Long id) {
        var invoice1 = invoiceRepository.getReferenceById(id);
        invoice1.setPaid(true);
    }
}

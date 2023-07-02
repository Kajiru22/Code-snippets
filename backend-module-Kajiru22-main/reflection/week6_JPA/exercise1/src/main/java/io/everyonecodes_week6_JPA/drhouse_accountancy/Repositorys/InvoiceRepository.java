package io.everyonecodes_week6_JPA.drhouse_accountancy.Repositorys;

import io.everyonecodes_week6_JPA.drhouse_accountancy.Data.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}

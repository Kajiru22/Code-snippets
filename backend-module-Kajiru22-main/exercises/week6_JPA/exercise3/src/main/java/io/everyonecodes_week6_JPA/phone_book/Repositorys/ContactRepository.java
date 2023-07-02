package io.everyonecodes_week6_JPA.phone_book.Repositorys;

import io.everyonecodes_week6_JPA.phone_book.Data.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findByPostalCode(String postalCode);
}

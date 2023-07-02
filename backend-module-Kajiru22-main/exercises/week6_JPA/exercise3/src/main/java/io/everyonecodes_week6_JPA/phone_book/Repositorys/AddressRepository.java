package io.everyonecodes_week6_JPA.phone_book.Repositorys;

import io.everyonecodes_week6_JPA.phone_book.Data.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

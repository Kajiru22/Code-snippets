package io.everyonecodes_week6_JPA.drhouse_accountancy.Repositorys;

import io.everyonecodes_week6_JPA.drhouse_accountancy.Data.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {


    Optional<Patient> findByUuid(String uuid);
}

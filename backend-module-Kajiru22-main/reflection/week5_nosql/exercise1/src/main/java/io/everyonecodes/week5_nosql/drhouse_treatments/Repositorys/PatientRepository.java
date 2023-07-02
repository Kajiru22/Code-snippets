package io.everyonecodes.week5_nosql.drhouse_treatments.Repositorys;

import io.everyonecodes.week5_nosql.drhouse_treatments.Data.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {
}

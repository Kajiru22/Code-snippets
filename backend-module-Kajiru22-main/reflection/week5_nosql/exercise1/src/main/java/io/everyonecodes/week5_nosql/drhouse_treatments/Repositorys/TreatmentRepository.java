package io.everyonecodes.week5_nosql.drhouse_treatments.Repositorys;

import io.everyonecodes.week5_nosql.drhouse_treatments.Data.Treatment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TreatmentRepository extends MongoRepository<Treatment, String> {
}

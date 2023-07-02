package io.everyonecodes_week5_nosql.the_final_countdown.Repository;
import io.everyonecodes_week5_nosql.the_final_countdown.Data.Accumulation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccumulationRepository extends MongoRepository<Accumulation, String> {



}

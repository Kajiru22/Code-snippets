package io.everyonecodes_week5_nosql.the_final_countdown.Repository;
import io.everyonecodes_week5_nosql.the_final_countdown.Data.Countdown;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface CountdownRepository extends MongoRepository<Countdown, String> {

    Optional<Countdown> findByCountGreaterThanEqual(int number);
    Optional<Countdown> findByCountGreaterThan(int number);
}

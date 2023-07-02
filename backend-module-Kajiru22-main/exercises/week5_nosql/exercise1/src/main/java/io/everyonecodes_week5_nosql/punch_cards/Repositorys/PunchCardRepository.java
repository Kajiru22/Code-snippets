package io.everyonecodes_week5_nosql.punch_cards.Repositorys;

import io.everyonecodes_week5_nosql.punch_cards.Data.PunchCard;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PunchCardRepository extends MongoRepository<PunchCard, String> {

}

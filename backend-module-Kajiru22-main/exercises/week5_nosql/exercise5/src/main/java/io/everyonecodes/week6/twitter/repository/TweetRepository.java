package io.everyonecodes.week6.twitter.repository;

import io.everyonecodes.week6.twitter.domain.Tweet;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TweetRepository extends MongoRepository<Tweet, String> {
    List<Tweet> findByOrderByTimestampDesc();

    List<Tweet> findByUserOrderByTimestampDesc(String user);
}

package io.everyonecodes.week6.twitter.logic;

import io.everyonecodes.week6.twitter.domain.Tweet;
import io.everyonecodes.week6.twitter.repository.TweetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TwitterService {
    private final TweetRepository tweetRepository;

    public TwitterService(TweetRepository tweetRepository) {this.tweetRepository = tweetRepository;}

    public List<Tweet> findAllTweets() {
        return tweetRepository.findByOrderByTimestampDesc();
    }
    public List<Tweet> findTweetsByUser (String user) {
        return tweetRepository.findByUserOrderByTimestampDesc(user);
    }
    public Tweet addTweet(Tweet tweet) {
        tweet.timestampNow();
        tweetRepository.save(tweet);
        return tweet;
    }
//    public Tweet addTweet(String user, String text) {
//        Tweet tweet = new Tweet(user, text);
//        tweet.timestampNow();
//        tweetRepository.save(tweet);
//        return tweet;
//    }
    public void addLikeById(String id){
        Optional<Tweet> oTweet = tweetRepository.findById(id);
        oTweet.ifPresent(Tweet::addLike);
        oTweet.ifPresent(tweetRepository::save);
    }
    public void addCommentById(String id, String comment) {
        Optional<Tweet> oTweet = tweetRepository.findById(id);
        oTweet.ifPresent(tweet -> tweet.addComment(comment));
        oTweet.ifPresent(tweetRepository::save);
    }
}

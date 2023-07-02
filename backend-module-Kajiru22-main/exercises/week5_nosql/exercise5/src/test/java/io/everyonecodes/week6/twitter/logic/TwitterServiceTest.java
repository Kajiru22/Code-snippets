package io.everyonecodes.week6.twitter.logic;

import io.everyonecodes.week6.twitter.domain.Tweet;
import io.everyonecodes.week6.twitter.repository.TweetRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class TwitterServiceTest {
    @MockBean
    TweetRepository tweetRepository;

    @Autowired
    TwitterService twitterService;

    @Test
    void findAllTweets() {
        twitterService.findAllTweets();
        Mockito.verify(tweetRepository).findByOrderByTimestampDesc();
    }

    @Test
    void findTweetsByUser() {
        twitterService.findTweetsByUser("test");
        Mockito.verify(tweetRepository).findByUserOrderByTimestampDesc("test");
    }

    @Test
    void addTweet() {
        Tweet tweet = new Tweet("user", "text");
        assertNull(tweet.getId());
        assertNull(tweet.getTimestamp());
        assertEquals(Collections.emptyList(), tweet.getComments());
        twitterService.addTweet(tweet);
        assertNotNull(tweet.getId());
        assertNotNull(tweet.getTimestamp());
        assertEquals(Collections.emptyList(), tweet.getComments());
        Mockito.verify(tweetRepository).save(Mockito.any(Tweet.class));
    }

    @Test
    void addLikeByIdToFoundTweet() {
        Tweet tweet = new Tweet("user", "text");
        Mockito.when(tweetRepository.findById(Mockito.any(String.class)))
                .thenReturn(Optional.of(tweet));
        twitterService.addLikeById("id");
        assertEquals(1, tweet.getLikes());
        Mockito.verify(tweetRepository).findById(Mockito.any(String.class));
        Mockito.verify(tweetRepository).save(Mockito.any(Tweet.class));
    }

    @Test
    void addLikeByIdToNotFoundTweet() {
        Mockito.when(tweetRepository.findById(Mockito.any(String.class)))
                .thenReturn(Optional.empty());
        twitterService.addLikeById("id");
        Mockito.verify(tweetRepository).findById(Mockito.any(String.class));
        Mockito.verify(tweetRepository,Mockito.never()).save(Mockito.any(Tweet.class));
    }

    @Test
    void addCommentByIdToFoundTweet() {
        Tweet tweet = new Tweet("user", "text");
        Mockito.when(tweetRepository.findById(Mockito.any(String.class)))
                .thenReturn(Optional.of(tweet));
        twitterService.addCommentById("id","comment");
        assertTrue(tweet.getComments().contains("comment"));
        Mockito.verify(tweetRepository).findById(Mockito.any(String.class));
        Mockito.verify(tweetRepository).save(Mockito.any(Tweet.class));
    }
    @Test
    void addCommentByIdToNotFoundTweet() {
        Mockito.when(tweetRepository.findById(Mockito.any(String.class)))
                .thenReturn(Optional.empty());
        twitterService.addCommentById("id", "comment");
        Mockito.verify(tweetRepository).findById(Mockito.any(String.class));
        Mockito.verify(tweetRepository,Mockito.never()).save(Mockito.any(Tweet.class));
    }
}
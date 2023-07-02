package io.everyonecodes.week6.twitter.endpoint;

import io.everyonecodes.week6.twitter.domain.Tweet;
import io.everyonecodes.week6.twitter.logic.TwitterService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TweetsEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @MockBean
    TwitterService twitterService;

    String url = "/tweets";

    @Test
    void getAllTweets() {
        restTemplate.getForObject(url, Tweet[].class);
        Mockito.verify(twitterService).findAllTweets();
    }

    @Test
    void getTweetsByUser() {
        restTemplate.getForObject(url + "/user/user", Tweet[].class);
        Mockito.verify(twitterService).findTweetsByUser("user");
    }

    @Test
    void postTweet() {
        Tweet tweet = new Tweet("user", "text");
        restTemplate.postForObject(url, tweet, Tweet.class);
        Mockito.verify(twitterService).addTweet(Mockito.any(Tweet.class));
    }

    @Test
    void addLikeById() {
        restTemplate.put(url+"/id/likes", null);
        Mockito.verify(twitterService).addLikeById("id");
    }

    @Test
    void addCommentById() {
        restTemplate.put(url+"/id/comments", "comment");
        Mockito.verify(twitterService).addCommentById("id", "comment");
    }
}
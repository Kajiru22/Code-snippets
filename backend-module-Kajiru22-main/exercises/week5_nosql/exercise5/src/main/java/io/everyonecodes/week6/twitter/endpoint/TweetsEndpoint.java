package io.everyonecodes.week6.twitter.endpoint;

import io.everyonecodes.week6.twitter.domain.Tweet;
import io.everyonecodes.week6.twitter.logic.TwitterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetsEndpoint {
    private final TwitterService twitterService;

    public TweetsEndpoint(TwitterService twitterService) {this.twitterService = twitterService;}

    @GetMapping
    List<Tweet> getAllTweets() {
        return twitterService.findAllTweets();
    }
    @GetMapping("/user/{user}")
    List<Tweet> getTweetsByUser(@PathVariable String user) {
        return twitterService.findTweetsByUser(user);
    }
    @PostMapping
    Tweet postTweet(@RequestBody Tweet tweet) {
        return twitterService.addTweet(tweet);
    }
    @PutMapping("/{id}/likes")
    void addLikeById(@PathVariable String id) {
        twitterService.addLikeById(id);
    }
    @PutMapping("/{id}/comments")
    void addCommentById(@PathVariable String id, @RequestBody String comment) {
        twitterService.addCommentById(id, comment);
    }
}

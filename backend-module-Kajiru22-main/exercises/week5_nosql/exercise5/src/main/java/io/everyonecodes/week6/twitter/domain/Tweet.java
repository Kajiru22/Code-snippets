package io.everyonecodes.week6.twitter.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Tweet {
    private String id;
    private String user;
    private String text;
    private int likes;
    private List<String> comments = new ArrayList<>();
    private LocalDateTime timestamp;

    public Tweet() {}

    public Tweet(String user, String text) {
        this.user = user;
        this.text = text;
    }

    public void timestampNow() {timestamp = LocalDateTime.now();}
    public void addLike() {likes++;}
    public void addComment(String comment) {comments.add(comment);}

    public String getId() {return id;}
    public String getUser() {return user;}
    public String getText() {return text;}
    public int getLikes() {return likes;}
    public List<String> getComments() {return comments;}
    public LocalDateTime getTimestamp() {return timestamp;}

    public void setId(String id) {this.id = id;}

    public void setUser(String user) {this.user = user;}

    public void setText(String text) {this.text = text;}

    public void setLikes(int likes) {this.likes = likes;}

    public void setComments(List<String> comments) {this.comments = comments;}

    public void setTimestamp(LocalDateTime timestamp) {this.timestamp = timestamp;}
}

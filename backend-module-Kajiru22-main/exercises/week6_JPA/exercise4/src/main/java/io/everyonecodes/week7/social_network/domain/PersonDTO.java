package io.everyonecodes.week7.social_network.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonDTO {
    private Long id;
    private String name;
    private List<String> friendNames = new ArrayList<>();

    public void addFriend(String friend) {
        friendNames.add(friend);
    }
    public Long getId() {return id;}
    public String getName() {return name;}
    public List<String> getFriendNames() {return friendNames;}

    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setFriendNames(List<String> friendNames) {this.friendNames = friendNames;}
}

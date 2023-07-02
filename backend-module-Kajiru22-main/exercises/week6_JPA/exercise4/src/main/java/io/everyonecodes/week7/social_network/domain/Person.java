package io.everyonecodes.week7.social_network.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Person> friends = new ArrayList<>();

    public void addFriend(Person friend) {
        friends.add(friend);
    }

    public void unFriend(Person person) {
        friends.remove(person);
    }

    public Long getId() {return id;}
    public String getName() {return name;}
    public List<Person> getFriends() {return friends;}

    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setFriends(List<Person> friends) {this.friends = friends;}
}

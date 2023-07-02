package io.everyonecodes.week2_properties.rock_scissors_paper.domain;

public class Move {

    private String name;
    private String defeats;

    public Move() {
    }

    public Move(String name, String defeats) {
        this.name = name;
        this.defeats = defeats;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getDefeats() {
        return defeats;
    }

    void setDefeats(String defeats) {
        this.defeats = defeats;
    }
}

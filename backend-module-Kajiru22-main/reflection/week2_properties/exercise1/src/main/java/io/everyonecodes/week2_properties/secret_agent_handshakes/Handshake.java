package io.everyonecodes.week2_properties.secret_agent_handshakes;


public class Handshake {

    private int number;
    private String move;

    public Handshake() {
    }

    public Handshake(int number, String move) {
        this.number = number;
        this.move = move;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

}
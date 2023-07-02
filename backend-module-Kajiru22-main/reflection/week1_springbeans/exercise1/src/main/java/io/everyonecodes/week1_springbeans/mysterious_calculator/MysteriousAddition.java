package io.everyonecodes.week1_springbeans.mysterious_calculator;

public class MysteriousAddition {
    private final int number;

    public MysteriousAddition(int number) {
        this.number = number;
    }

    public int apply(int input) {
        return input + this.number;
    }
}
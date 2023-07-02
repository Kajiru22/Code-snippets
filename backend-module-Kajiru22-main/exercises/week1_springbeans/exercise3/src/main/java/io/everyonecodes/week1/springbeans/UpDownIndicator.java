package io.everyonecodes.week1.springbeans;

import org.springframework.stereotype.Service;

@Service
public class UpDownIndicator {

    private final Rounder rounder;

    public UpDownIndicator(Rounder rounder) {
        this.rounder = rounder;
    }

    public String indicate(double number) {
        number = number % 1;
        if (number < 0.5) {
            return "DOWN";
        } else if (number > 0.5) {
            return "UP";
        } else {
            return "SAME";
        }
    }
}

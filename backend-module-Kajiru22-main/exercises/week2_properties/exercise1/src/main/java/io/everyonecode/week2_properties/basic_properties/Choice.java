package io.everyonecode.week2_properties.basic_properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Choice {

    boolean choice;

    public Choice(@Value("${basic.choice}") boolean choice) {
        this.choice = choice;
    }

    public boolean get() {
        return choice;
    }
}

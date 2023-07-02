package io.everyonecodes.week2_properties.advanced_yml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties("advanced")
public class Choice {

    public Choice() {
    }

    public void setChoice(boolean choice) {
        this.choice = choice;
    }

    private boolean choice;

    public Choice(boolean choice) {
        this.choice = choice;
    }

    public boolean get() {
        return choice;
    }
}

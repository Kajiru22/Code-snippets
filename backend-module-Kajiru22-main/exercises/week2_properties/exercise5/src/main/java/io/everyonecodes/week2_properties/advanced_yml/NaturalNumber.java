package io.everyonecodes.week2_properties.advanced_yml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties("advanced")
public class NaturalNumber {

    public NaturalNumber() {
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;

    public NaturalNumber(int number) {
        this.number = number;
    }

    public int get() {
        return number;
    }


}

package io.everyonecodes.week2_properties.advanced_yml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties("advanced")
public class DecimalNumber {

    public DecimalNumber() {
    }

    public void setNumber(double number) {
        this.number = number;
    }

    private double number;

    public DecimalNumber(double number) {
        this.number = number;
    }

    public double get() {
        return number;
    }
}

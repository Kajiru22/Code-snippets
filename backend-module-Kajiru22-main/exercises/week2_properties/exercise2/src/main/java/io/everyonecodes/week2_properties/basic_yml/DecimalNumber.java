package io.everyonecodes.week2_properties.basic_yml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

@Service
public class DecimalNumber {

    double number;

    public DecimalNumber(@Value("${basic.decimalNumber}")double number) {
        this.number = number;
    }

    public double get() {
        return number;
    }
}

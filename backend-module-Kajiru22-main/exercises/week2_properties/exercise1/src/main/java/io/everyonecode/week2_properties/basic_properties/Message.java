package io.everyonecode.week2_properties.basic_properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Message {

    String message;

    public Message(@Value("${basic.message}")String message) {
        this.message = message;
    }

    public String get() {
        return message;
    }
}

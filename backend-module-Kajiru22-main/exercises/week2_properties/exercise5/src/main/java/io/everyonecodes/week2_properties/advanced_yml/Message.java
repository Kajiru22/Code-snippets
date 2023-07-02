package io.everyonecodes.week2_properties.advanced_yml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties("advanced")
public class Message {

    public Message() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String get() {
        return message;
    }
}

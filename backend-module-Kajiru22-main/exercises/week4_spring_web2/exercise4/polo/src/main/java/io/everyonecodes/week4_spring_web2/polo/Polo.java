package io.everyonecodes.week4_spring_web2.polo;

import org.springframework.stereotype.Service;

@Service
public class Polo {

    public String send(String message) {
        if(message.equals("Marco")) {
            return "Polo";
        }else {
            return "What?";
        }
    }
}

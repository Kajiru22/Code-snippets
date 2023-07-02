package io.everyonecodes.week1_springbeans.hello_world;

import org.springframework.stereotype.Service;

@Service
public class HelloWorld {

    public String get() {
        return "Hello World!";
    }
}

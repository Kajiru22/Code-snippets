package io.everyonecodes.week1_springbeans.amazing_hello_world;

import org.springframework.stereotype.Service;

@Service
public class World {

    public String get() {
        return "World";
    }
}

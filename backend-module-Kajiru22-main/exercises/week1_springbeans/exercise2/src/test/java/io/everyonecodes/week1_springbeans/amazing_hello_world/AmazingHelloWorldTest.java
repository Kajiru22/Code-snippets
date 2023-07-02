package io.everyonecodes.week1_springbeans.amazing_hello_world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class AmazingHelloWorldTest {

    @Autowired
    AmazingHelloWorld world;

    @Test
    void get() {
        String result = world.get();
        String expected = "Hello World";
        Assertions.assertEquals(result, expected);
    }
}
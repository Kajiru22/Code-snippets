package io.everyonecodes.week1_springbeans.amazing_hello_world;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloTest {

    @Autowired
    Hello hello;

    @Test
    void get() {
        String result = hello.get();
        String expected = "Hello ";
    }
}
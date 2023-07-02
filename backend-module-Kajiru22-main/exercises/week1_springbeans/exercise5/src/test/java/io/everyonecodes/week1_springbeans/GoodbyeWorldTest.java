package io.everyonecodes.week1_springbeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoodbyeWorldTest {
    @Autowired
    GoodbyeWorld goodbyeWorld;

    @Test
    void get() {
        Assertions.assertEquals(goodbyeWorld.get(), "Goodbye World");
    }
}
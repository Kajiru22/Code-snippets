package io.everyonecodes.week1_springbeans.amazing_goodbye_world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AmazingGoodbyeWorldTest {

    AmazingGoodbyeWorld amazingGoodbyeWorld = new AmazingGoodbyeWorld();
    @Test
    void get() {
        Assertions.assertEquals("Goodbye World", amazingGoodbyeWorld.get());
    }
}
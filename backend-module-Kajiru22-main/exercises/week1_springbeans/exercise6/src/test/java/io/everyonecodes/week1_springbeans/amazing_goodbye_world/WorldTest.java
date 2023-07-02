package io.everyonecodes.week1_springbeans.amazing_goodbye_world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorldTest {

    World world = new World();

    @Test
    void get() {
        Assertions.assertEquals("World", world.get());
    }
}
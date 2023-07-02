package io.everyonecodes.week1_springbeans.amazing_goodbye_world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class GoodbyeTest {
    Goodbye goodbye = new Goodbye();

    @Test
    void get() {
        Assertions.assertEquals( "Goodbye ", goodbye.get());
    }
}
package io.everyonecode.week2_properties.basic_properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MessageTest {

    @Autowired
    Message message;

    @Test
    void get() {
        assertEquals(message.get(), "My brain is only a receiver, in the Universe there is a core from which we obtain knowledge, strength and inspiration. - Nikola Tesla");
    }
}
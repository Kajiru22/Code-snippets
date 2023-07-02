package io.everyonecodes.week2_properties.basic_yml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class NaturalNumberTest {
    @Autowired
    NaturalNumber naturalNumber;

    @Test
    void get() {
        assertEquals(naturalNumber.get(), 369);
    }
}
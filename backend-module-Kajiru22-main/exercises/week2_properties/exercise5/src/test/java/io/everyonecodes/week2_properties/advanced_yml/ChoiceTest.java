package io.everyonecodes.week2_properties.advanced_yml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
@SpringBootTest
class ChoiceTest {

    @Autowired
    Choice choice;

    @Test
    void get() {
        assertFalse(choice.get());
    }
}
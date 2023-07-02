package io.everyonecodes.week2_properties.basic_yml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class SeveralValuesTest {
    @Autowired
    SeveralValues severalValues;

    @Test
    void getNumbers() {
        assertEquals(severalValues.getNumbers(), List.of(3, 6, 9));
    }

    @Test
    void getDecimalNumbers() {
        assertEquals(severalValues.getDecimalNumbers(), List.of(3.14, 2.71, 3.359));
    }

    @Test
    void getWords() {
        assertEquals(severalValues.getWords(), List.of("Answer", "to", "the", "Ultimate", "Question", "of", "Life", "the", "Universe", "and", "Everything"));
    }

    @Test
    void getChoices() {
        assertEquals(severalValues.getChoices(), List.of(true, false, false, true));
    }
}
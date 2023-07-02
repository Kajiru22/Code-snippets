package io.everyonecodes.week2_properties.basic_yml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DecimalNumberTest {

    @Autowired
    DecimalNumber decimalNumber;

    @Test
    void get() {
        Assertions.assertEquals(decimalNumber.get(), 1.618);
    }
}
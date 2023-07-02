package io.everyonecode.week2_properties.emergency_numbers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FireEmergencyTest {

    @Autowired
    FireEmergency fireEmergency;

    @Test
    void getName() {
        assertEquals(fireEmergency.getName(), "Fire Brigade");
    }

    @Test
    void getNumber() {
        assertEquals(fireEmergency.getNumber(), "122");
    }
}
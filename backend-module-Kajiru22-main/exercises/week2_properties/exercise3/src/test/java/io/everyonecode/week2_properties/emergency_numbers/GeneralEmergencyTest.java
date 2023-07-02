package io.everyonecode.week2_properties.emergency_numbers;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class GeneralEmergencyTest {

    @Autowired
    GeneralEmergency generalEmergency;

    @Test
    void getName() {
        assertEquals(generalEmergency.getName(), "General Emergency");
    }

    @Test
    void getNumber() {
        assertEquals(generalEmergency.getNumber(), "112");
    }
}
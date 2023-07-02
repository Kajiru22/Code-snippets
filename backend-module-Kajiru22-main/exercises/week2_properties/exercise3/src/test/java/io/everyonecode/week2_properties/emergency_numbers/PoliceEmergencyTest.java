package io.everyonecode.week2_properties.emergency_numbers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PoliceEmergencyTest {

    @Autowired
    PoliceEmergency policeEmergency;

    @Test
    void getName() {

        assertEquals(policeEmergency.getName(), "Police");
    }

    @Test
    void getNumber() {
        assertEquals(policeEmergency.getNumber(), "133");
    }
}
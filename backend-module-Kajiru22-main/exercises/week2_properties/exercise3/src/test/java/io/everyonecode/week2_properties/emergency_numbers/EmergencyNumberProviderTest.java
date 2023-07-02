package io.everyonecode.week2_properties.emergency_numbers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmergencyNumberProviderTest {

    @Autowired
    EmergencyNumberProvider emergencyNumberProvider;

    @Test
    void provide() {
        assertEquals(emergencyNumberProvider.provide("Police"), "133");
        assertEquals(emergencyNumberProvider.provide("Fire Brigade"), "122");
        assertEquals(emergencyNumberProvider.provide("General Emergency"), "112");
        assertEquals(emergencyNumberProvider.provide("Tech support"), "112");
    }
}
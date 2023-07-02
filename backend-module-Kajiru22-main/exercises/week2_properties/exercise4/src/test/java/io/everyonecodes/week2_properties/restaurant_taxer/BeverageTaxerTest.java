package io.everyonecodes.week2_properties.restaurant_taxer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BeverageTaxerTest {
    RestaurantDish soda = new RestaurantDish("soda", 3.50);
    RestaurantDish cola = new RestaurantDish("cola", 9.99);

    @Autowired
    BeverageTaxer taxer;

    @Test
    void matches() {
        assertTrue(taxer.matches(soda));
        assertFalse(taxer.matches(cola));
    }

    @Test
    void tax() {
        assertEquals(taxer.tax(soda), 4.2, 0.0001);
        assertEquals(taxer.tax(cola), 11.988, 0.0001);
    }
}
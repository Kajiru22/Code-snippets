package io.everyonecodes.week2_properties.restaurant_taxer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FoodstuffTaxerTest {
    RestaurantDish soup = new RestaurantDish("potato soup", 3.50);
    RestaurantDish burger = new RestaurantDish("Burger", 9.99);

    @Autowired
    FoodstuffTaxer taxer;

    @Test
    void matches() {
        assertTrue(taxer.matches(soup));
        assertFalse(taxer.matches(burger));
    }

    @Test
    void tax() {
        assertEquals(taxer.tax(soup), 3.85, 0.0001);
        assertEquals(taxer.tax(burger), 10.989, 0.0001);
    }
}
package io.everyonecodes.week1_springbeans.mysterious_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MysteriousAdditionTest {

       MysteriousAddition mysteriousAddition = new MysteriousAddition(5);

    @Test
    public void testApplyPositiveNumber() {
        int input = 10;
        int expected = 15;
        int result = mysteriousAddition.apply(input);
        assertEquals(expected, result);
    }

    @Test
    public void testApplyNegativeNumber() {
        int input = -10;
        int expected = -5;
        int result = mysteriousAddition.apply(input);
        assertEquals(expected, result);
    }

    @Test
    public void testApplyZero() {
        int input = 0;
        int expected = 5;
        int result = mysteriousAddition.apply(input);
        assertEquals(expected, result);
    }
}

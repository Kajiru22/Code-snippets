package io.everyonecodes.week1_springbeans.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultipleFinderTest {

    MultipleFinder finderOfThree = new MultipleFinder(3);
    MultipleFinder finderOfFive = new MultipleFinder(5);

    @Test
    void isMultipleOfFive() {
        Assertions.assertEquals( false, finderOfFive.isMultiple(3));
        Assertions.assertEquals( true, finderOfFive.isMultiple(5));
    }

    @Test
    void isMultipleOfThree() {
        Assertions.assertEquals( true, finderOfThree.isMultiple(3));
        Assertions.assertEquals( false, finderOfThree.isMultiple(5));
    }
}
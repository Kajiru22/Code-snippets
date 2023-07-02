package io.everyonecodes.week1_springbeans.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class FizzBuzzTest {
    @Autowired
    FizzBuzz fizzBuzz;

    @Test
    void apply() {
        Assertions.assertEquals("Fizz", fizzBuzz.apply(3));
        Assertions.assertEquals("Buzz", fizzBuzz.apply(5));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.apply(15));
        Assertions.assertEquals("2", fizzBuzz.apply(2));
    }
}
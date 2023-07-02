package io.everyonecodes.week1.springbeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RounderTest {
    @Autowired
    Rounder rounder;
    @ParameterizedTest
    @MethodSource("parameter")
    void roundUp(double expected, double input) {
        var result = rounder.roundUp(input);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @MethodSource("parameter2")
    void roundDown(double expected, double input) {
        var result = rounder.roundDown(input);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> parameter() {
        return Stream.of(
                Arguments.of(1.00, 0.70),
                Arguments.of(3.00, 2.80),
                Arguments.of(4.00, 3.60),
                Arguments.of(-5.00, -5.50),
                Arguments.of(-11.00, -11.95),
                Arguments.of(36.00, 35.10)
        );
    }

    static Stream<Arguments> parameter2() {
        return Stream.of(
                Arguments.of(0.00, 0.70),
                Arguments.of(2.00, 2.80),
                Arguments.of(3.00, 3.60),
                Arguments.of(-6.00, -5.50),
                Arguments.of(-12.00, -11.95),
                Arguments.of(35.00, 35.10)
        );
    }
}
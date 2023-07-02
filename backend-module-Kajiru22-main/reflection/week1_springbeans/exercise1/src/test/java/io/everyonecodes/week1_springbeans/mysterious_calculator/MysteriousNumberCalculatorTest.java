package io.everyonecodes.week1_springbeans.mysterious_calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MysteriousNumberCalculatorTest {
    MysteriousNumberCalculator mysteriousNumberCalculator;
    MysteriousAddition mysteriousAdditionOne = new MysteriousAddition(10);
    MysteriousAddition mysteriousAdditionTwo = new MysteriousAddition(20);
    MysteriousNumberFormatter mysteriousNumberFormatter = new MysteriousNumberFormatter();

    @ParameterizedTest
    @MethodSource("parameter")
    public void testCalculate(int input, String expectedFormatted) {
        Set<MysteriousAddition> additions = new HashSet<>();
        additions.add(mysteriousAdditionOne);
        additions.add(mysteriousAdditionTwo);
        mysteriousNumberCalculator = new MysteriousNumberCalculator(additions, mysteriousNumberFormatter);
        String result = mysteriousNumberCalculator.calculate(input);
        assertEquals(expectedFormatted, result);
    }

    private static Stream<Arguments> parameter() {
        return Stream.of(
                Arguments.of(10, "The mysterious number is 40"),
                Arguments.of(-10, "The mysterious number is 20"),
                Arguments.of(0, "The mysterious number is 30")
        );
    }
}

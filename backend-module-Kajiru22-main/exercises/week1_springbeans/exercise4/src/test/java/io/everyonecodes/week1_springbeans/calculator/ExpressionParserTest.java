package io.everyonecodes.week1_springbeans.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExpressionParserTest {
    ExpressionParser parser = new ExpressionParser();

    @Test
    public void testParseWithValidInput() {
        var result = parser.parse("2 + 3");
        var expected = new Expression("+", 2.0, 3.0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testParseWithInvalidNumberFormat() {
        var expected = NumberFormatException.class;
        Assertions.assertThrows(expected, () -> parser.parse("2 + a"));
    }
    @Test()
    public void testParseWithInsufficientTerms() {
        var expected = ArrayIndexOutOfBoundsException.class;
        Assertions.assertThrows(expected, () -> parser.parse("2 +"));
    }
    @Test
    public void testParseWithNegativeNumbers() {
        Expression result = parser.parse("-2 + -3.6");
        Expression expected = new Expression("+", -2, -3.6);
        Assertions.assertEquals(expected, result);
    }
}
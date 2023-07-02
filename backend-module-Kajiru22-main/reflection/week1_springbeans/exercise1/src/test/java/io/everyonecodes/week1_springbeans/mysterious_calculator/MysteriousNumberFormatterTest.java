package io.everyonecodes.week1_springbeans.mysterious_calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MysteriousNumberFormatterTest {
    MysteriousNumberFormatter mysteriousNumberFormatter = new MysteriousNumberFormatter();


    @Test
    public void testFormatPositiveNumber() {
        int input = 10;
        String expected = "The mysterious number is 10";
        String result = mysteriousNumberFormatter.format(input);
        assertEquals(expected, result);
    }

    @Test
    public void testFormatNegativeNumber() {
        int input = -10;
        String expected = "The mysterious number is -10";
        String result = mysteriousNumberFormatter.format(input);
        assertEquals(expected, result);
    }

    @Test
    public void testFormatZero() {
        int input = 0;
        String expected = "The mysterious number is 0";
        String result = mysteriousNumberFormatter.format(input);
        assertEquals(expected, result);
    }
}

package io.everyonecodes.week1.springbeans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UpCounterTest {

    @Autowired
    UpCounter counter;

    @Test
    public void testCount() {
        List<Double> list = List.of(1.0, 2.0, 3.0, 4.0);
        var count = counter.count(list);
        int expected = 0;
        assertEquals(expected, count);
    }

    @Test
    public void testCount2() {
        List<Double> list = List.of(1.6, 2.7, 3.8, 4.2);
        var count = counter.count(list);
        int expected = 3;
        assertEquals(expected, count);
    }
    @Test
    public void testCount3() {
        List<Double> list = List.of();
        var count = counter.count(list);
        int expected = 0;
        assertEquals(expected, count);
    }
}
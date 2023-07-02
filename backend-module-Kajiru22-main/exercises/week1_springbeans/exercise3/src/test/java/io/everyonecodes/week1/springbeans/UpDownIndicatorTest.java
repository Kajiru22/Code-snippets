package io.everyonecodes.week1.springbeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class UpDownIndicatorTest {
    @Autowired
    UpDownIndicator indicator;

    @Test
    void indicate() {
        List<String> expected = List.of("DOWN", "UP", "DOWN", "UP", "SAME", "DOWN", "DOWN");
        List<Double> list = List.of(3.4,5.6,3.1,7.9,5.5,6.3,1.0);
        List<String> resultList = new ArrayList<>();
        list.forEach(e -> resultList.add(indicator.indicate(e)));
        Assertions.assertEquals(expected, resultList);
    }
}
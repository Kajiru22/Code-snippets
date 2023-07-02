package io.everyonecodes.week1.springbeans;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpCounter {
    private final UpDownIndicator indicator;

    public UpCounter(UpDownIndicator indicator) {
        this.indicator = indicator;
    }

    public int count(List<Double> list) {
        return (int) list.stream()
                .map(indicator::indicate)
                .filter(result -> result.equals("UP"))
                .count();
    }
}
package io.everyonecodes.week1_springbeans.mysterious_calculator;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MysteriousNumberCalculator {
    Set<MysteriousAddition> mysteriousAdditions;
    MysteriousNumberFormatter mysteriousNumberFormatter;

    public MysteriousNumberCalculator(Set<MysteriousAddition> mysteriousAdditions, MysteriousNumberFormatter mysteriousNumberFormatter) {
        this.mysteriousAdditions = mysteriousAdditions;
        this.mysteriousNumberFormatter = mysteriousNumberFormatter;
    }

    public String calculate(int number) {
        for (MysteriousAddition mysteriousAddition : mysteriousAdditions) {
            number = mysteriousAddition.apply(number);
        }
        return mysteriousNumberFormatter.format(number);
    }
}
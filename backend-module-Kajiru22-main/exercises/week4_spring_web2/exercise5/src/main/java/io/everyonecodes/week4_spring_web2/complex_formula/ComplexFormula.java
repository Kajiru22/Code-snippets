package io.everyonecodes.week4_spring_web2.complex_formula;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ComplexFormula {

    private final FormulaClient client;

    public ComplexFormula(FormulaClient client) {
        this.client = client;
    }

    public String interact(int number) {
        String numberString = Integer.toString(number);
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < numberString.length(); i++) {
            digits.add(Character.getNumericValue(numberString.charAt(i)));
        }
        var numbers = digits.stream()
                .map(client::interact)
                .collect(Collectors.toList());
        return numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
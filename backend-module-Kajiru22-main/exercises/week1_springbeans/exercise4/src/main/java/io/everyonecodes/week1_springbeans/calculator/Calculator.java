package io.everyonecodes.week1_springbeans.calculator;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class Calculator {
    private final ExpressionParser expressionParser;
    private final Set<Calculation> calculations;

    public Calculator(ExpressionParser expressionParser, Set<Calculation> calculations) {
        this.expressionParser = expressionParser;
        this.calculations = calculations;
    }

    public double calculate(String input) {
        Expression expression = expressionParser.parse(input);
        for (Calculation calculation : calculations) {
            if (calculation.matches(expression)) {
                return calculation.calculate(expression);
            }
        }
        throw new IllegalArgumentException("Calculation not supported");
    }
}


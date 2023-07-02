package io.everyonecodes.week1_springbeans.calculator;

import org.springframework.stereotype.Service;

@Service
public class Multiplication extends Calculation {
    public Multiplication() {
        super("*");
    }

    @Override
    public double calculate(Expression expression) {
        return expression.getTerm1() * expression.getTerm2();
    }
}

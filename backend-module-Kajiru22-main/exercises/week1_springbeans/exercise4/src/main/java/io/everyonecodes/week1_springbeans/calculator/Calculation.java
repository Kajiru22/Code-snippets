package io.everyonecodes.week1_springbeans.calculator;

import org.springframework.stereotype.Service;

@Service
public abstract class Calculation {
    private String symbol;

    public Calculation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean matches(Expression expression) {
        return expression.getSymbol().equals(this.symbol);
    }

    public abstract double calculate(Expression expression);
}


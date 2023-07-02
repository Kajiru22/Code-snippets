package io.everyonecodes.week1_springbeans.calculator;

import org.springframework.stereotype.Service;

@Service
public class ExpressionParser {
    public Expression parse(String input) {
        String[] terms = input.split(" ");
        String symbol = terms[1];
        double term1 = Double.parseDouble(terms[0]);
        double term2 = Double.parseDouble(terms[2]);
        return new Expression(symbol, term1, term2);
    }
}

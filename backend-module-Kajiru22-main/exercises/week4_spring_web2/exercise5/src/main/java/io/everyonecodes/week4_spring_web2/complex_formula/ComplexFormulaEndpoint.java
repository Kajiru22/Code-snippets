package io.everyonecodes.week4_spring_web2.complex_formula;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/complexFormula")
public class ComplexFormulaEndpoint {

    private final ComplexFormula complexFormula;

    public ComplexFormulaEndpoint(ComplexFormula complexFormula) {
        this.complexFormula = complexFormula;
    }

    @PostMapping("/{number}")
    public String interact(@PathVariable int number) {
       return complexFormula.interact(number);
    }
}

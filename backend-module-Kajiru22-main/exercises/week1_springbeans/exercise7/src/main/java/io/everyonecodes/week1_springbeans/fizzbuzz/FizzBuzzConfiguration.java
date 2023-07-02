package io.everyonecodes.week1_springbeans.fizzbuzz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FizzBuzzConfiguration {

    @Bean
    FizzBuzz fizzBuzz() {
        return new FizzBuzz();
    }
}

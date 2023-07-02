package io.everyonecodes.week1_springbeans.mysterious_calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MysteriousAdditionConfiguration {
    @Bean
    MysteriousAddition mysteriousAdditionOne() {
        return new MysteriousAddition(1);
    }

    @Bean
    MysteriousAddition mysteriousAdditionTwo() {
        return new MysteriousAddition(2);
    }

    @Bean
    MysteriousNumberFormatter mysteriousNumberFormatter() {
        return new MysteriousNumberFormatter();
    }
}


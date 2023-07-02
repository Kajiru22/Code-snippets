package io.everyonecodes.week2_properties.credit_cards.logic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CreditCardsTest {

    @Autowired
    CreditCards creditCards;

    @ParameterizedTest
    @CsvSource({
            "Invalid, 37828224631000",
            "Not Supported, 3530111333300000",
            "American Express, 378282246310005",
            "Discover, 6011111111111117",
            "MasterCard, 5555555555554444",
            "Visa, 4111111111111111",
    })
    void inspect(String expected, String number) {
        String result = creditCards.inspect(number);

        assertEquals(expected, result);
    }
}
package io.everyonecodes.week2_properties.credit_cards.logic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IssuerTest {

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(false, new Issuer("test", Set.of(), Set.of()), "12"),
                Arguments.of(false, new Issuer("test", Set.of("2"), Set.of()), "12"),
                Arguments.of(false, new Issuer("test", Set.of("1"), Set.of()), "12"),
                Arguments.of(false, new Issuer("test", Set.of("1"), Set.of(3)), "12"),
                Arguments.of(true, new Issuer("test", Set.of("1"), Set.of(2)), "12"),
                Arguments.of(true, new Issuer("test", Set.of("1", "2"), Set.of(1, 2)), "12")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void issues(boolean expected, Issuer issuer, String number) {
        boolean result = issuer.issues(number);

        assertEquals(expected, result);
    }

    @Test
    void getName() {
        String expected = "test";
        Issuer issuer = new Issuer();
        issuer.setName(expected);

        String result = issuer.getName();

        assertEquals(expected, result);
    }
}
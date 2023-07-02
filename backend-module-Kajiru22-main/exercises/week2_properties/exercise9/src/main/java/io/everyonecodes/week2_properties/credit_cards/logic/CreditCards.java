package io.everyonecodes.week2_properties.credit_cards.logic;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CreditCards {

    private final Luhn luhn;
    private final Set<Issuer> issuers;

    public CreditCards(Luhn luhn, Set<Issuer> issuers) {
        this.luhn = luhn;
        this.issuers = issuers;
    }

    public String inspect(String number) {
        if (!luhn.isValid(number)) {
            return "Invalid";
        }
        return issuers.stream()
                .filter(issuer -> issuer.issues(number))
                .map(Issuer::getName)
                .findFirst()
                .orElse("Not Supported");
    }
}

package io.everyonecodes.week2_properties.credit_cards.configuration;

import io.everyonecodes.week2_properties.credit_cards.logic.Issuer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
@ConfigurationProperties("creditcards")
public class IssuerConfiguration {

    private Set<Issuer> issuers;

    void setIssuers(Set<Issuer> issuers) {
        this.issuers = issuers;
    }

    @Bean
    Set<Issuer> issuers() {
        return issuers;
    }
}


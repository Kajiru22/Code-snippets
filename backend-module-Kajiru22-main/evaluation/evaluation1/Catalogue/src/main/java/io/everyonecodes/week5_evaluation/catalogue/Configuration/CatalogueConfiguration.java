package io.everyonecodes.week5_evaluation.catalogue.Configuration;

import io.everyonecodes.week5_evaluation.catalogue.Service.Catalogue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatalogueConfiguration {

    @Bean
    Catalogue catalogue() {
        return new Catalogue();
    }
}

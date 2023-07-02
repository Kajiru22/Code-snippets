package io.everyonecodes.week3_spring_web.advanced_types.Configuration;

import io.everyonecodes.week3_spring_web.advanced_types.Data_classes.Academy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("education")

public class AcademyConfiguration {

    private List<Academy> academies;


    @Bean
    List<Academy> academies() {
        return academies;
    }

    public void setAcademies(List<Academy> academies) {
        this.academies = academies;
    }
}

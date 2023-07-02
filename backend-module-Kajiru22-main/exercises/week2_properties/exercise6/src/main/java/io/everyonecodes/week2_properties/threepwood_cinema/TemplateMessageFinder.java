package io.everyonecodes.week2_properties.threepwood_cinema;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@ConfigurationProperties("cinema.specialoffer")
public class TemplateMessageFinder {

    private String defaultMessage;
    private List<Template> templates;

    public TemplateMessageFinder() {
    }

    public String find(String customerName) {
        for (Template template : templates) {
            if (customerName.equals(template.getKeyword())) {
                return template.getMessage();
            }
        }
        return defaultMessage;
    }
}


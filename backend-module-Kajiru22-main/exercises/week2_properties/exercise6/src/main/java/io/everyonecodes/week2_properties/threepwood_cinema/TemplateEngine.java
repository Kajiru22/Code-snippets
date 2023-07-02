package io.everyonecodes.week2_properties.threepwood_cinema;

public class TemplateEngine {

    private TemplateMessageFinder finder;

    public String customiseMessage(String customerName) {
        var message = finder.find(customerName);
        return message.replace("--name--", customerName);
    }
}

package io.everyonecode.week2_properties.emergency_numbers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FireEmergency implements EmergencyNumber{

    private final String name;
    private final String number;

    public FireEmergency(@Value("${emergency.fire.name}") String name,
                         @Value("${emergency.fire.number}") String number) {
        this.name = name;
        this.number = number;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNumber() {
        return number;
    }
}

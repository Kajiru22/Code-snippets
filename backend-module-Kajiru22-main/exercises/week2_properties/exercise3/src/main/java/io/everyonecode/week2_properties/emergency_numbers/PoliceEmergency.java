package io.everyonecode.week2_properties.emergency_numbers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PoliceEmergency implements EmergencyNumber{

    private final String name;
    private final String number;

    public PoliceEmergency(@Value("${emergency.police.name}") String name,
                           @Value("${emergency.police.number}") String number) {
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

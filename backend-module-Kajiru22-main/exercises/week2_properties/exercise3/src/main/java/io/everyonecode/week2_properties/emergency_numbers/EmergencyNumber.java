package io.everyonecode.week2_properties.emergency_numbers;

import org.springframework.stereotype.Service;

@Service
public interface EmergencyNumber {

    String getName();
    String getNumber();
}

package io.everyonecode.week2_properties.emergency_numbers;

import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Set;

@Service
public class EmergencyNumberProvider {


    private final GeneralEmergency generalEmergency;

    private final Set<EmergencyNumber> emergencyNumberSet;

    public EmergencyNumberProvider(GeneralEmergency generalEmergency, Set<EmergencyNumber> emergencyNumberSet) {
        this.generalEmergency = generalEmergency;
        this.emergencyNumberSet = emergencyNumberSet;
    }


    public String provide(String name) {
        return emergencyNumberSet.stream().
                filter(e -> e.getName().equalsIgnoreCase(name)).
                findFirst().
                map(EmergencyNumber::getNumber).
                orElse(generalEmergency.getNumber());
    }
}

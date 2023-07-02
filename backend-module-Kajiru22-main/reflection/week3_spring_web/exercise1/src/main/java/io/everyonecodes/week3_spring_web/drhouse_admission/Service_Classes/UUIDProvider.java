package io.everyonecodes.week3_spring_web.drhouse_admission.Service_Classes;

import io.everyonecodes.week3_spring_web.drhouse_admission.Data_Classes.Patient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@Service
public class UUIDProvider {

    private final Map<String, UUID> cache = new HashMap<>();

    public void provideUUID(Patient patient) {
        UUID uuid = cache.get(patient.getName());
        if (uuid == null) {
            uuid = UUID.randomUUID();
            cache.put(patient.getName(), uuid);
        }
        patient.setUuid(String.valueOf(uuid));
    }
    public Map<String, UUID> getCacheSnapshot() {
        return new HashMap<>(cache);
    }

    public UUID findUUID(String patientName) {
        return cache.get(patientName);
    }
}

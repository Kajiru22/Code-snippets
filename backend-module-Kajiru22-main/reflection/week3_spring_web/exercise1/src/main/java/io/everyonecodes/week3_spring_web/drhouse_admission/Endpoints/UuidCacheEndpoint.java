package io.everyonecodes.week3_spring_web.drhouse_admission.Endpoints;

import io.everyonecodes.week3_spring_web.drhouse_admission.Service_Classes.UUIDProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;
@RestController
@RequestMapping("/uuids")
public class UuidCacheEndpoint {
    private final UUIDProvider uuidProvider;

    public UuidCacheEndpoint(UUIDProvider uuidProvider) {
        this.uuidProvider = uuidProvider;
    }

    @GetMapping
    public Map<String, UUID> getUuidCache() {
        return uuidProvider.getCacheSnapshot();
    }

    @GetMapping("/{patientName}")
    public UUID getUuidForPatient(@PathVariable String patientName) {
        return uuidProvider.findUUID(patientName);
    }
}
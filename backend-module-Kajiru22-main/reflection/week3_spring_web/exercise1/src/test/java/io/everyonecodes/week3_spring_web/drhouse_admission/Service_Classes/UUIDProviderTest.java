package io.everyonecodes.week3_spring_web.drhouse_admission.Service_Classes;

import io.everyonecodes.week3_spring_web.drhouse_admission.Data_Classes.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UUIDProviderTest {

    private final UUIDProvider uuidProvider = new UUIDProvider();

    @Test
    public void testProvideUUID() {
        Patient patient1 = new Patient("John Doe", "", "");
        Patient patient2 = new Patient("Jane Doe", "", "");

        uuidProvider.provideUUID(patient1);
        uuidProvider.provideUUID(patient2);

        Assertions.assertNotNull(patient1.getUuid());
        Assertions.assertNotNull(patient2.getUuid());
        Assertions.assertNotEquals(patient1.getUuid(), patient2.getUuid());

        // Check that the cache was updated
        Assertions.assertEquals(uuidProvider.findUUID(patient1.getName()), UUID.fromString(patient1.getUuid()));
        Assertions.assertEquals(uuidProvider.findUUID(patient2.getName()), UUID.fromString(patient2.getUuid()));
    }

    @Test
    public void testFindUUID() {
        Patient patient1 = new Patient("John Doe", "", "");
        Patient patient2 = new Patient("Jane Doe", "", "");

        uuidProvider.provideUUID(patient1);
        uuidProvider.provideUUID(patient2);

        var uuid1 = uuidProvider.findUUID("John Doe");
        var uuid2 = uuidProvider.findUUID("Jane Doe");

        Assertions.assertEquals(uuidProvider.findUUID(patient1.getName()), uuid1);
        Assertions.assertEquals(uuidProvider.findUUID(patient2.getName()), uuid2);
        Assertions.assertNull(uuidProvider.findUUID("Unknown patient"));
    }
}
package io.everyonecodes.week2_properties.secret_agent_handshakes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@ConfigurationProperties("handshakes")
class HandshakeNumberToMoveTranslatorTest {

    @Autowired
    HandshakeNumberToMoveTranslator translator;


    @Test
    void translate() {
        Assertions.assertEquals("perform the move thumb touches back", translator.translate(2));
        Assertions.assertEquals("perform the move little finger grab", translator.translate(3));
        Assertions.assertEquals(List.of("perform the move thumb touches back", "perform the move little finger grab" ), translator.translate(23));
    }
}
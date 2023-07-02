package io.everyonecodes.week2_properties.secret_agent_handshakes;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@ConfigurationProperties("secretagent")
public class HandshakeNumberToMoveTranslator {

    public HandshakeNumberToMoveTranslator() {
    }

    public void setHandshakes(Set<Handshake> handshakes) {
        this.handshakes = handshakes;
    }

    public Set<Handshake> handshakes;

    public String translate(int number) {
        String move = "";
        for(Handshake handshake : handshakes) {
            if(handshake.getNumber() == number) {
                move = handshake.getMove();
            }
        }
        return move;
    }
}

package io.everyonecodes.week2_properties.rock_scissors_paper.configuration;

import io.everyonecodes.week2_properties.rock_scissors_paper.domain.Move;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("game")
public class MoveConfiguration {

    private List<Move> moves;

    void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    @Bean
    List<Move> moves() {
        return moves;
    }
}


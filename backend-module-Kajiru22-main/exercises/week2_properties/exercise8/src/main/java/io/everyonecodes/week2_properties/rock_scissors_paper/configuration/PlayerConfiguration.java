package io.everyonecodes.week2_properties.rock_scissors_paper.configuration;

import io.everyonecodes.week2_properties.rock_scissors_paper.domain.Move;
import io.everyonecodes.week2_properties.rock_scissors_paper.logic.MoveUtils;
import io.everyonecodes.week2_properties.rock_scissors_paper.logic.player.Computer;
import io.everyonecodes.week2_properties.rock_scissors_paper.logic.player.Human;
import io.everyonecodes.week2_properties.rock_scissors_paper.logic.player.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlayerConfiguration {

    @Bean
    Player player1(MoveUtils moveUtils) {
        return new Human(moveUtils);
    }

    @Bean
    Player player2(List<Move> moves) {
        return new Computer(moves);
    }
}

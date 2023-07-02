package io.everyonecodes.week2_properties.rock_scissors_paper.logic;

import io.everyonecodes.week2_properties.rock_scissors_paper.domain.Move;
import org.springframework.stereotype.Service;

@Service
public class Judge {

    public String judge(Move move1, Move move2) {
        if (move1.equals(move2)) {
            return "Nobody wins";
        }
        if (move1.getDefeats().contains(move2.getName())) {
            return "Player 1 wins";
        }
        return "Player 2 wins";
    }
}


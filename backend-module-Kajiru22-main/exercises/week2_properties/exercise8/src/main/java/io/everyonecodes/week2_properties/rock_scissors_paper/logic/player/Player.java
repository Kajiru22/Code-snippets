package io.everyonecodes.week2_properties.rock_scissors_paper.logic.player;

import io.everyonecodes.week2_properties.rock_scissors_paper.domain.Move;

public interface Player {
    Move play();

    boolean wantsToPlayAgain();
}

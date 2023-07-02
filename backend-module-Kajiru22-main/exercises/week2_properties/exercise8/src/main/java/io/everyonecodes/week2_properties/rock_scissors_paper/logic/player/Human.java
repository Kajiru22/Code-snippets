package io.everyonecodes.week2_properties.rock_scissors_paper.logic.player;

import io.everyonecodes.week2_properties.rock_scissors_paper.domain.Move;
import io.everyonecodes.week2_properties.rock_scissors_paper.logic.MoveUtils;

import java.util.Optional;
import java.util.Scanner;

public class Human implements Player {

    private final MoveUtils moveUtils;
    private final Scanner scanner = new Scanner(System.in);

    public Human(MoveUtils moveUtils) {
        this.moveUtils = moveUtils;
    }

    @Override
    public Move play() {
        Optional<Move> oMove = Optional.empty();
        while (oMove.isEmpty()) {
            oMove = chooseMove();
        }
        return oMove.get();
    }

    private Optional<Move> chooseMove() {
        System.out.print("Choose a move (" + moveUtils.getNames() + "): ");
        String name = scanner.nextLine();
        return moveUtils.getOne(name);
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.print("Do you want to play again? (y, N): ");
        String choice = scanner.nextLine();
        return "y".equalsIgnoreCase(choice);
    }
}


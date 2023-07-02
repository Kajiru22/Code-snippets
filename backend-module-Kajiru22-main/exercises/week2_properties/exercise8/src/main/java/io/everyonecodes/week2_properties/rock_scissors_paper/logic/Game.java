package io.everyonecodes.week2_properties.rock_scissors_paper.logic;

import io.everyonecodes.week2_properties.rock_scissors_paper.domain.Move;
import io.everyonecodes.week2_properties.rock_scissors_paper.logic.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class Game {

    private final Player player1;
    private final Player player2;
    private final Judge judge;

    public Game(Player player1, Player player2, Judge judge) {
        this.player1 = player1;
        this.player2 = player2;
        this.judge = judge;
    }

    public void play() {
        boolean playing = true;
        while (playing) {
            playOneRound();
            playing = askPlayers();
        }
    }
    @Autowired
    private ApplicationContext appContext;
    private void playOneRound() {
        String[] beans = appContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        System.out.println("List of beans:");
        for (String bean : beans) {
            System.out.println(bean);
        }
        Move move1 = player1.play();
        Move move2 = player2.play();
        System.out.println("Player 1 chose: " + move1.getName());
        System.out.println("Player 2 chose: " + move2.getName());
        String message = judge.judge(move1, move2);
        System.out.println(message);
    }

    private boolean askPlayers() {
        return player1.wantsToPlayAgain() && player2.wantsToPlayAgain();
    }
}


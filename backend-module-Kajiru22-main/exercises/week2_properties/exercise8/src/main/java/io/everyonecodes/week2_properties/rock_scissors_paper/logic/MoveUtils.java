package io.everyonecodes.week2_properties.rock_scissors_paper.logic;

import io.everyonecodes.week2_properties.rock_scissors_paper.domain.Move;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MoveUtils {

    private final List<Move> moves;

    public MoveUtils(List<Move> moves) {
        this.moves = moves;
    }

    public String getNames() {
        return moves.stream()
                .map(Move::getName)
                .collect(Collectors.joining(", "));
    }

    public Optional<Move> getOne(String name) {
        return moves.stream()
                .filter(move -> move.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}


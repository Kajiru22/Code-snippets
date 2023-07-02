package io.everyonecodes.week10_evaluation2.steam_purchases.Repositorys;

import io.everyonecodes.week10_evaluation2.steam_purchases.Data.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

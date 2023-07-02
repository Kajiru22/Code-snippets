package io.everyonecodes.week10_evaluation2.steam_purchases.Service;

import io.everyonecodes.week10_evaluation2.steam_purchases.Data.Game;
import io.everyonecodes.week10_evaluation2.steam_purchases.Data.Purchase;
import io.everyonecodes.week10_evaluation2.steam_purchases.Data.User;
import io.everyonecodes.week10_evaluation2.steam_purchases.Repositorys.GameRepository;
import io.everyonecodes.week10_evaluation2.steam_purchases.Repositorys.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PurchaseService {
    private final UserRepository userRepository;
    private final GameRepository gameRepository;

    public PurchaseService(UserRepository userRepository, GameRepository gameRepository) {
        this.userRepository = userRepository;
        this.gameRepository = gameRepository;
    }

    public Purchase processPurchase(String username, Long id) {
        Optional<User> optionalUser = userRepository.findByUsername(username);
        Optional<Game> optionalGame = gameRepository.findById(id);

        if (optionalUser.isPresent() && optionalGame.isPresent()) {
            User user = optionalUser.get();
            Game game = optionalGame.get();

            Purchase purchase = new Purchase();
            purchase.setUser(user);
            purchase.setGame(game);

            user.getPurchases().add(purchase);
            game.getPurchases().add(purchase);

            userRepository.save(user);
            gameRepository.save(game);

            return purchase;
        } else {
            throw new RuntimeException("User or game not found");
        }
    }
}


package io.everyonecodes.week2_properties.secret_agent_handshakes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PriceToHandshakesTranslator {
    private int minPrice;
    private int maxPrice;
    private HandshakeNumberToMoveTranslator translator;

    public PriceToHandshakesTranslator(@Value("${secretagent.minPrice}") int minPrice,@Value("${secretagent.maxPrice}") int maxPrice, HandshakeNumberToMoveTranslator translator) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.translator = translator;
    }

    public List<String> translate(int price) {
        if(price < minPrice || price > maxPrice) {
            return List.of("Invalid price, it has to be at minimum 10 and maximum 9999");
        }
        List<String> movesAsString = new ArrayList<>();
        List<Integer> movesAsNumbers = Arrays.stream(String.valueOf(price).split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for(int number : movesAsNumbers) {
            movesAsString.add(translator.translate(number));
        }
        return movesAsString;
    }
}

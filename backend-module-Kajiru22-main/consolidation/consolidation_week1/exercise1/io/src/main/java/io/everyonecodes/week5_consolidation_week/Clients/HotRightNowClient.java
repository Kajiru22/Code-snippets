package io.everyonecodes.week5_consolidation_week.Clients;

import io.everyonecodes.week5_consolidation_week.Data.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Component
@Order(2)
public class HotRightNowClient implements RecommendationProvider {

    private final RestTemplate restTemplate;

    private final String url;

    public HotRightNowClient(RestTemplate restTemplate,
                             @Value("${hotRightNow}") String url) {
        this.restTemplate = restTemplate;
        this.url = url;
    }

    @Override
    public List<Movie> provide(String user) {
        var output = restTemplate.getForObject(url, Movie[].class);
        return Arrays.stream(Objects.requireNonNull(output)).collect(Collectors.toList());
    }
}

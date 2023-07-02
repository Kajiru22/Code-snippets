package io.everyonecodes_week5_consolidation_week_hot_right_now.Endpoints;

import io.everyonecodes_week5_consolidation_week_hot_right_now.Data.Movie;
import io.everyonecodes_week5_consolidation_week_hot_right_now.Service.MovieStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieEndpoint {

    private final MovieStore movieStore;

    public MovieEndpoint(MovieStore movieStore) {
        this.movieStore = movieStore;
    }

    @GetMapping
    public List<Movie> provide() {
        return movieStore.provide();
    }
}

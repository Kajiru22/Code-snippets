package io.everyonecodes.week5_consolidation_week.tailored_recommendations.Endpoints;

import io.everyonecodes.week5_consolidation_week.tailored_recommendations.Data.Movie;
import io.everyonecodes.week5_consolidation_week.tailored_recommendations.Data.TailoredRecommendation;
import io.everyonecodes.week5_consolidation_week.tailored_recommendations.Service.TailoredRecommendationsStore;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tailoredrecommendations")
public class TailoredRecommendationsEndpoint {

    private final TailoredRecommendationsStore store;

    public TailoredRecommendationsEndpoint(TailoredRecommendationsStore store) {
        this.store = store;
    }

    @GetMapping("/{userUuid}")
    public List<Movie> getRecommendation(@PathVariable String userUuid) {
        return store.getAllMovies(userUuid);
    }

    @PostMapping
    public TailoredRecommendation addMovie(@RequestBody TailoredRecommendation recommendation) {
        return store.postMovies(recommendation);
    }
}

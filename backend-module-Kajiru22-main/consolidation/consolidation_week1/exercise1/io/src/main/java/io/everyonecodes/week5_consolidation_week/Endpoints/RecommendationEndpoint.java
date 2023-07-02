package io.everyonecodes.week5_consolidation_week.Endpoints;

import io.everyonecodes.week5_consolidation_week.Data.Movie;
import io.everyonecodes.week5_consolidation_week.Service.RecommendationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recommendations")
public class RecommendationEndpoint {

    private final RecommendationService service;

    public RecommendationEndpoint(RecommendationService service) {
        this.service = service;
    }

    @GetMapping("/{user}")
    public List<Movie> getRecommendations(@PathVariable String user) {
        return service.getRecommendation(user);
    }
}

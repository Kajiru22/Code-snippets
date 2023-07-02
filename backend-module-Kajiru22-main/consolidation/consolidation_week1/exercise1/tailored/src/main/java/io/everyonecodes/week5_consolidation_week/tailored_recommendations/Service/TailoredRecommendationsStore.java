package io.everyonecodes.week5_consolidation_week.tailored_recommendations.Service;

import io.everyonecodes.week5_consolidation_week.tailored_recommendations.Data.Movie;
import io.everyonecodes.week5_consolidation_week.tailored_recommendations.Data.TailoredRecommendation;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@ConfigurationProperties("data")
public class TailoredRecommendationsStore {

    private Set<TailoredRecommendation> recommendation;

    public void setRecommendation(Set<TailoredRecommendation> recommendation) {
        this.recommendation = recommendation;
    }

    public List<Movie> getAllMovies(String userUuid) {
        return recommendation.stream()
                .filter(tailoredRecommendation -> tailoredRecommendation.getUserUuid().equals(userUuid))
                .map(TailoredRecommendation::getMovie).collect(Collectors.toList());
    }
    public TailoredRecommendation postMovies(TailoredRecommendation newRecommendation) {
        recommendation.add(newRecommendation);
        return newRecommendation;
    }
}
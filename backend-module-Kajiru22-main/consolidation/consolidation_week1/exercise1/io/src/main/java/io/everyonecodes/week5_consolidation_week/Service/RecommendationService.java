package io.everyonecodes.week5_consolidation_week.Service;

import io.everyonecodes.week5_consolidation_week.Clients.RecommendationProvider;
import io.everyonecodes.week5_consolidation_week.Data.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {
    @Autowired
    private List<RecommendationProvider> recommendationProviders;

    public void setRecommendationProviders(List<RecommendationProvider> recommendationProviders) {
        this.recommendationProviders = recommendationProviders;
    }
    public List<Movie> getRecommendation(String user) {
        for (RecommendationProvider moviesClient : recommendationProviders){
            if (moviesClient.provide(user).size() > 0){
                return moviesClient.provide(user);
            }
        }

        throw new IllegalArgumentException();

    }

    /*public List<Movie> getRecommendations(String user) {
        List<Movie> recommendations = new ArrayList<>();
        for (RecommendationProvider provider : recommendationProviders) {
            List<Movie> providerRecommendations = provider.provide(user);
            if (providerRecommendations != null && !providerRecommendations.isEmpty()) {
                recommendations.addAll(provider.provide(user));
            }
        }
        return recommendations;
    }*/
}

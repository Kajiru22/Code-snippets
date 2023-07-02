package io.everyonecodes.week5_consolidation_week.Clients;

import io.everyonecodes.week5_consolidation_week.Data.Movie;

import java.util.List;

public interface RecommendationProvider {

    public List<Movie> provide(String user);
}

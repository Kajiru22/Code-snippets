package io.everyonecodes_week5_consolidation_week_hot_right_now.Service;

import io.everyonecodes_week5_consolidation_week_hot_right_now.Data.Movie;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@ConfigurationProperties("data")
public class MovieStore {

    private List<Movie> movies;

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> provide() {
        return movies;
    }
}

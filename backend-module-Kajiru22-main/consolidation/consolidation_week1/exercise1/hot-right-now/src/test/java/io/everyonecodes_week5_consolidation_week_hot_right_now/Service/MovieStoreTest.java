package io.everyonecodes_week5_consolidation_week_hot_right_now.Service;
import io.everyonecodes_week5_consolidation_week_hot_right_now.Data.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MovieStoreTest {

    @Autowired
    private MovieStore movieStore;

    @Test
    public void testProvide() {
        List<Movie> movies = List.of(new Movie("Movie 1", "synopsis1"),
                                    new Movie("Movie 2", "synopsis2"));
        movieStore.setMovies(movies);
        List<Movie> responseMovies = movieStore.provide();
        assertEquals(movies, responseMovies);
    }
}

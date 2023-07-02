package io.everyonecodes_week5_consolidation_week_hot_right_now.Endpoints;
import io.everyonecodes_week5_consolidation_week_hot_right_now.Data.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MovieEndpointTest {

    @MockBean
    MovieEndpoint endpoint;

    @Test
    public void testProvide() {
        List<Movie> movies = List.of(new Movie("title1", "synopsis1"),
                                            new Movie("title2", "synopsis2"));
        when(endpoint.provide()).thenReturn(movies);
        List<Movie> responseMovies = endpoint.provide();
        assertEquals(movies, responseMovies);
    }
}

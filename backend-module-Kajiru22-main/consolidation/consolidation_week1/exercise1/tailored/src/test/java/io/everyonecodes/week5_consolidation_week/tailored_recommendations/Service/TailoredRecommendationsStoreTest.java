package io.everyonecodes.week5_consolidation_week.tailored_recommendations.Service;
import io.everyonecodes.week5_consolidation_week.tailored_recommendations.Data.Movie;
import io.everyonecodes.week5_consolidation_week.tailored_recommendations.Data.TailoredRecommendation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class TailoredRecommendationsStoreTest {

    @MockBean
    private TailoredRecommendationsStore recommendationsStore;

    @Test
    public void testGetAllMovies() {
        String userUuid = "user-123";
        Set<TailoredRecommendation> recommendations = new HashSet<>(Arrays.asList(
                new TailoredRecommendation(userUuid, new Movie("movie1", "synopsis1")),
                new TailoredRecommendation(userUuid, new Movie("movie2", "synopsis2")),
                new TailoredRecommendation("user-456", new Movie("movie3", "synopsis3"))
        ));
        when(recommendationsStore.getAllMovies(userUuid))
                .thenReturn(recommendations.stream()
                        .filter(e -> e.getUserUuid().equals(userUuid))
                        .map(TailoredRecommendation::getMovie)
                        .collect(Collectors.toList()));

        List<Movie> expectedMovies = Arrays.asList(
                new Movie("movie1", "synopsis1"),
                new Movie("movie2", "synopsis2")
        );
        List<Movie> actualMovies = recommendationsStore.getAllMovies(userUuid);

        assertEquals(expectedMovies, actualMovies);
    }

    @Test
    public void testPostMovies() {
        TailoredRecommendation newRecommendation = new TailoredRecommendation("user-123", new Movie("movie1", "synopsis1"));
        Set<TailoredRecommendation> recommendations = new HashSet<>(Arrays.asList(
                new TailoredRecommendation("user-123",  new Movie("movie1", "synopsis1")),
                new TailoredRecommendation("user-123", new Movie("movie2", "synopsis2")),
                new TailoredRecommendation("user-456", new Movie("movie3", "synopsis3"))
        ));
        when(recommendationsStore.postMovies(newRecommendation)).thenReturn(newRecommendation);

        TailoredRecommendation actualRecommendation = recommendationsStore.postMovies(newRecommendation);

        assertEquals(newRecommendation, actualRecommendation);
        assertTrue(recommendations.contains(newRecommendation));
    }
}

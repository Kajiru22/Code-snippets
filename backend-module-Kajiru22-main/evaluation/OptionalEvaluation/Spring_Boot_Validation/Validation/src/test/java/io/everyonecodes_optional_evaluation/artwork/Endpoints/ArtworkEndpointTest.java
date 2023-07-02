package io.everyonecodes_optional_evaluation.artwork.Endpoints;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.everyonecodes_optional_evaluation.artwork.Data.Artwork;
import io.everyonecodes_optional_evaluation.artwork.Data.Rating;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = ArtworkEndpoint.class)
class ArtworkEndpointValidationTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void whenInputIsInvalid_thenReturnsStatus400() throws Exception {
        Artwork artwork = new Artwork("Galinda", new Rating(7));
        String body = objectMapper.writeValueAsString(artwork);
        mvc.perform(post("/artworks")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(body))
                .andExpect(status().isBadRequest());
    }
}
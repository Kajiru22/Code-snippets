package io.everyonecodes_optional_evaluation.artwork.Endpoints;

import io.everyonecodes_optional_evaluation.artwork.Data.Artwork;
import io.everyonecodes_optional_evaluation.artwork.Repositorys.ArtworkRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class ArtworkEndpoint {


    private final ArtworkRepository artworkRepository;

    public ArtworkEndpoint(ArtworkRepository artworkRepository) {
        this.artworkRepository = artworkRepository;
    }

    @PostMapping("/artworks")
    public Artwork postArtwork(@Valid @RequestBody Artwork artwork) {
        return artworkRepository.save(artwork);
    }
}

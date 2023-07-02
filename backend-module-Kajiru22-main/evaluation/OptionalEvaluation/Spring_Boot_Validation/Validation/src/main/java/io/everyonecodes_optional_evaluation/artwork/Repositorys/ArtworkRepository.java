package io.everyonecodes_optional_evaluation.artwork.Repositorys;

import io.everyonecodes_optional_evaluation.artwork.Data.Artwork;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtworkRepository extends MongoRepository<Artwork, String> {
}

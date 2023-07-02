package io.everyonecodes.week6_JPA.couch_potato.Repository;

import io.everyonecodes.week6_JPA.couch_potato.Data.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {

    Film findByName(String name);

    @Query("SELECT f FROM Film f WHERE f.rating BETWEEN ?1 AND ?2")
    List<Film> findBetweenRating(double startRating, double maxRating);

    void deleteById(Long id);
}
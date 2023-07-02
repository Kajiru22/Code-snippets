package io.everyonecodes.week6_JPA.couch_potato.Service;

import io.everyonecodes.week6_JPA.couch_potato.Data.Film;
import io.everyonecodes.week6_JPA.couch_potato.Repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FilmService {

    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Film createRating(Film film) {
        filmRepository.save(film);
        return film;
    }

    public List<Film> showAll() {
       return filmRepository.findAll();
    }

    public Optional<Film> findOne(Long id) {
       return filmRepository.findById(id);
    }

    public Optional<Film> findByName(String name) {
       return Optional.of(filmRepository.findByName(name));
    }

    public List<Film> findBetweenRating(double startRating, double maxRating) {
        return (List<Film>) filmRepository.findBetweenRating(startRating, maxRating);
    }

    public void delete(Long id) {
        filmRepository.deleteById(id);
    }
}

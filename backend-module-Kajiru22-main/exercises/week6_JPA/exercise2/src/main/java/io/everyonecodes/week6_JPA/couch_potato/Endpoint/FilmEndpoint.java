package io.everyonecodes.week6_JPA.couch_potato.Endpoint;

import io.everyonecodes.week6_JPA.couch_potato.Data.Film;
import io.everyonecodes.week6_JPA.couch_potato.Service.FilmService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/films")
@Validated
public class FilmEndpoint {

    private final FilmService filmService;

    public FilmEndpoint(FilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping
    public Film createFilm(@Valid @RequestBody Film film) {
        return filmService.createRating(film);
    }

    @GetMapping
    public List<Film> showAll() {
        return filmService.showAll();
    }

    @GetMapping("/{id}")
    public Optional<Film> findOne(@PathVariable Long id) {
        return filmService.findOne(id);
    }

    @GetMapping("/search/{name}")
    public Optional<Film> findByName(@PathVariable("name") @NotBlank String name) {
        return filmService.findByName(name);
    }

    @GetMapping("/search/rating")
    public List<Film> findBetweenRating(@RequestParam("start") @DecimalMin("0.0") @DecimalMax("5.0") double start,
                                        @RequestParam("end") @DecimalMin("0.0") @DecimalMax("5.0") double end) {
        return filmService.findBetweenRating(start, end);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        filmService.delete(id);
    }
}

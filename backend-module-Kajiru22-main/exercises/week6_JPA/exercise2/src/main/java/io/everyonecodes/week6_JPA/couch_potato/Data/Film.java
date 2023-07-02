package io.everyonecodes.week6_JPA.couch_potato.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
public class Film {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String name;

    @Min(value = 0, message = "Value must be greater than or equal to 0")
    @Max(value = 5, message = "Value must be less than or equal to 5")
    private double rating;

    public Film(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public Film() {
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Double.compare(film.rating, rating) == 0 && Objects.equals(id, film.id) && Objects.equals(name, film.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rating);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}

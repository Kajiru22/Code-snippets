package io.everyonecodes_optional_evaluation.artwork.Data;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Objects;
@Validated
public class Rating {

    @Min(value = 1, message = "value must be greater than or equal to 1")
    @Max(value = 5, message = "value must be smaller than or equal to 5")
    private int stars;

    public Rating(int stars) {
        this.stars = stars;
    }

    public Rating() {
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return stars == rating.stars;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stars);
    }

    @Override
    public String toString() {
        return "Rating{" +
                "stars=" + stars +
                '}';
    }
}

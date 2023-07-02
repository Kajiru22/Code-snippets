package io.everyonecodes.week2_properties.restaurant_taxer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class Taxer {

    private final List<String> dishNames;
    private final double tax;

    public Taxer(List<String> dishNames, double tax) {
        this.dishNames = dishNames;
        this.tax = tax;
    }

    abstract boolean matches(RestaurantDish dish);

    abstract double tax(RestaurantDish dish);


    public List<String> getNames() {
        return dishNames;
    }

    public double getTax() {
        return tax;
    }
}

package io.everyonecodes.week2_properties.restaurant_taxer;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BillCalculator {

    private Set<Taxer> taxers;

    double calculate(RestaurantDish dish) {
        double sum = 0;
        for (Taxer tax : taxers) {
            if (tax.matches(dish)) {
                sum += tax.tax(dish);
            }
        }
        return sum;
    }
}
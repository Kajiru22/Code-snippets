package io.everyonecodes.week2_properties.restaurant_taxer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodstuffTaxer extends Taxer{


    public FoodstuffTaxer(@Value("${restaurant.foodstuff.names}")List<String> dishNames,
                          @Value("${restaurant.foodstuff.tax}") double tax) {
        super(dishNames, tax);
    }

    @Override
    boolean matches(RestaurantDish dish) {
        return (getNames().contains(dish.getName()));
    }

    @Override
    double tax(RestaurantDish dish) {
        return dish.getPrice() * getTax();
    }
}

package io.everyonecodes.week2_properties.restaurant_taxer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BeverageTaxer extends Taxer{
    

    public BeverageTaxer(@Value("${restaurant.beverages.names}")List<String> dishNames,
                         @Value("${restaurant.beverages.tax}") double tax) {
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

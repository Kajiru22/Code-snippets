package io.everyonecodes.week2_properties.restaurant_taxer;


public class RestaurantDish {

    private final String name;
    private final double price;

    public RestaurantDish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

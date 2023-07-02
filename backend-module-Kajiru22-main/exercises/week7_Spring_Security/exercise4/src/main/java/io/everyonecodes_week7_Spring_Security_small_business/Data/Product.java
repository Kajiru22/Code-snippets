package io.everyonecodes_week7_Spring_Security_small_business.Data;

import java.util.Objects;

public class Product {

    private String id;
    private String product;
    private boolean premium;

    public Product(String id, String product, boolean premium) {
        this.id = id;
        this.product = product;
        this.premium = premium;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return premium == product1.premium && Objects.equals(id, product1.id) && Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, premium);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", product='" + product + '\'' +
                ", premium=" + premium +
                '}';
    }
}

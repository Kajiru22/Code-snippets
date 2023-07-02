package io.everyonecodes.week5_evaluation.catalogue.Data;

import java.util.Objects;

public class ProductSelection {

    private String customerEmail;
    private String productName;
    private double productPrice;

    public ProductSelection(String customerEmail, String productName, double productPrice) {
        this.customerEmail = customerEmail;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public ProductSelection() {
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSelection that = (ProductSelection) o;
        return Double.compare(that.productPrice, productPrice) == 0 && Objects.equals(customerEmail, that.customerEmail) && Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerEmail, productName, productPrice);
    }

    @Override
    public String toString() {
        return "ProductSelection{" +
                "customerEmail='" + customerEmail + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}

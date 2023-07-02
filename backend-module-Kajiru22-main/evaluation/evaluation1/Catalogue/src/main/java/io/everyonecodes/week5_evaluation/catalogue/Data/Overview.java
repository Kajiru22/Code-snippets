package io.everyonecodes.week5_evaluation.catalogue.Data;

import java.util.Objects;

public class Overview {

    private String customerEmail;
    private String productName;
    private double productPrice;
    private double deliveryCost;
    private double totalPrice;

    public Overview(String customerEmail, String productName, double productPrice, double deliveryCost, double totalPrice) {
        this.customerEmail = customerEmail;
        this.productName = productName;
        this.productPrice = productPrice;
        this.deliveryCost = deliveryCost;
        this.totalPrice = totalPrice;
    }

    public Overview() {
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

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Overview overview = (Overview) o;
        return Double.compare(overview.productPrice, productPrice) == 0 && Double.compare(overview.deliveryCost, deliveryCost) == 0 && Double.compare(overview.totalPrice, totalPrice) == 0 && Objects.equals(customerEmail, overview.customerEmail) && Objects.equals(productName, overview.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerEmail, productName, productPrice, deliveryCost, totalPrice);
    }

    @Override
    public String toString() {
        return "Overview{" +
                "customerEmail='" + customerEmail + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", deliveryCost=" + deliveryCost +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

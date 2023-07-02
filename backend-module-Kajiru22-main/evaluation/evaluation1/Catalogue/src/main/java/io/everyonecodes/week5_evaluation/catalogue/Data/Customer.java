package io.everyonecodes.week5_evaluation.catalogue.Data;

import java.util.Objects;

public class Customer {

    private String email;
    private String accountType;

    public Customer(String email, String accountType) {
        this.email = email;
        this.accountType = accountType;
    }

    public Customer() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(email, customer.email) && Objects.equals(accountType, customer.accountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, accountType);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}

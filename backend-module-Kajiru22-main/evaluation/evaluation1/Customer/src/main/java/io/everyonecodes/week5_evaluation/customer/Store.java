package io.everyonecodes.week5_evaluation.customer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ConfigurationProperties("data")
public class Store {

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    private List<Customer> customers;
    public Customer provide(String email) {
        return (Customer) customers.stream().filter(e -> e.getEmail().equals(email));
    }
}

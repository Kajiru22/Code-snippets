package io.everyonecodes.week5_evaluation.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerEndpoint {

    private final Store store;

    public CustomerEndpoint(Store store) {
        this.store = store;
    }

    @GetMapping("/{email}")
    private Customer provide(@PathVariable String email) {
        return store.provide(email);
    }
}

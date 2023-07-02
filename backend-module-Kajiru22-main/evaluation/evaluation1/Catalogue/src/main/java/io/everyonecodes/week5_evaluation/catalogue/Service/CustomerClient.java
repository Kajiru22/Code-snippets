package io.everyonecodes.week5_evaluation.catalogue.Service;
import io.everyonecodes.week5_evaluation.catalogue.Data.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
public class CustomerClient {

    private final String url;

    public CustomerClient(@Value("${url}")String url) {
        this.url = url;
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public Customer provide(String email) {
        return restTemplate().getForObject(url + "/" +  email, Customer.class);
    }
}

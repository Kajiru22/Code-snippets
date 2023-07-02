package io.everyonecodes.week5_evaluation.catalogue.Service;

import io.everyonecodes.week5_evaluation.catalogue.Data.Overview;
import io.everyonecodes.week5_evaluation.catalogue.Data.ProductSelection;
import org.springframework.context.annotation.Bean;


public class OverviewCalculator {

    @Bean
    CustomerClient customerClient() {
        return customerClient();
    }

    public Overview provide(ProductSelection productSelection) {
        return new Overview(productSelection.getCustomerEmail(), productSelection.getProductName(),
                productSelection.getProductPrice(), 4.50, productSelection.getProductPrice() + 4.50);
    }
}

package io.everyonecodes.week5_evaluation.catalogue.Service;

import io.everyonecodes.week5_evaluation.catalogue.Data.Overview;
import io.everyonecodes.week5_evaluation.catalogue.Data.ProductSelection;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class Catalogue {

    public Catalogue(List<Overview> overviews) {
        this.overviews = overviews;
    }

    public Catalogue() {
    }

    @Bean
    OverviewCalculator overviewCalculator() {
        return new OverviewCalculator();
    }

    private List<Overview> overviews;

    public ProductSelection transform(ProductSelection productSelection) {
        var overview = overviewCalculator().provide(productSelection);
        overviews.add(overview);
        return productSelection;
    }

    public List<Overview> provide() {
        return overviews;
    }

    public void setOverviews(List<Overview> overviews) {
        this.overviews = overviews;
    }
}

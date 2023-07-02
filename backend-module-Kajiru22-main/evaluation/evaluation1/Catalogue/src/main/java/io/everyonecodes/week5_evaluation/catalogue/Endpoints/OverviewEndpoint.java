package io.everyonecodes.week5_evaluation.catalogue.Endpoints;

import io.everyonecodes.week5_evaluation.catalogue.Service.Catalogue;
import io.everyonecodes.week5_evaluation.catalogue.Data.Overview;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/overviews")
public class OverviewEndpoint {

    private final Catalogue catalogue;

    public OverviewEndpoint(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    @GetMapping
    public List<Overview> provide() {
        return catalogue.provide();
    }
}

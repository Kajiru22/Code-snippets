package io.everyonecodes.week5_evaluation.catalogue.Endpoints;

import io.everyonecodes.week5_evaluation.catalogue.Service.Catalogue;
import io.everyonecodes.week5_evaluation.catalogue.Data.ProductSelection;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productselections")
public class ProductSelectionEndpoint {

    private final Catalogue catalogue;

    public ProductSelectionEndpoint(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    @PostMapping
    public ProductSelection provide(@RequestBody ProductSelection productSelection) {
        return catalogue.transform(productSelection);
    }
}

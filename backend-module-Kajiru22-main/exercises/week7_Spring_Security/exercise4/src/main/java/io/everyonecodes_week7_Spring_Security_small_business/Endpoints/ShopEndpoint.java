package io.everyonecodes_week7_Spring_Security_small_business.Endpoints;

import io.everyonecodes_week7_Spring_Security_small_business.Data.Product;
import io.everyonecodes_week7_Spring_Security_small_business.Service.ShopService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ShopEndpoint {

    private final ShopService shopService;

    public ShopEndpoint(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/products")
    public List<Product> showAllNonPremium() {
        return shopService.showAllNonPremium();
    }

    @Secured("ROLE_PREMIUM")
    @GetMapping("/products/premium")
    public List<Product> showAllPremium() {
        return shopService.showAllPremium();
    }

    @Secured("ROLE_ADMIN")
    @PostMapping("/products/{product}")
    public Product addProduct(@RequestBody Product product) {
        return shopService.addProduct(product);
    }

    @Secured("ROLE_ADMIN")
    @PutMapping("/shop/open")
    public void openShop() {
        shopService.openShop();
    }

    @Secured("ROLE_ADMIN")
    @PutMapping("/shop/close")
    public void closeShop() {
        shopService.closeShop();
    }
}

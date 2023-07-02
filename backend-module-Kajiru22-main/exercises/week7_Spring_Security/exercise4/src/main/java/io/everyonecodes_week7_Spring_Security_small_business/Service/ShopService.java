package io.everyonecodes_week7_Spring_Security_small_business.Service;

import io.everyonecodes_week7_Spring_Security_small_business.Data.Product;
import io.everyonecodes_week7_Spring_Security_small_business.Repositorys.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {

    private final ProductRepository productRepository;

    private boolean open;

    public ShopService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> showAllNonPremium() {
        if (open) {
            return productRepository.findNonPremiumProducts();
        } else {
            return new ArrayList<>();
        }
    }

    public List<Product> showAllPremium() {
        if (open) {
            return productRepository.findPremiumProducts();
        } else {
            return new ArrayList<>();
        }
    }

    public void openShop() {
        System.out.println("Shop is open!");
        setOpen(true);
    }

    public void closeShop() {
        System.out.println("Shop is closed!");
        setOpen(false);
    }
}

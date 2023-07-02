package io.everyonecodes_week7_Spring_Security_small_business.Repositorys;

import io.everyonecodes_week7_Spring_Security_small_business.Data.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{ 'premium' : true }")
    List<Product> findPremiumProducts();
    @Query("{ 'premium' : { $ne : true } }")
    List<Product> findNonPremiumProducts();
}

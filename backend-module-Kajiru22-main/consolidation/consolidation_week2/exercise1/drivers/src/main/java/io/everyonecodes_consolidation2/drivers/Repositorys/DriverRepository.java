package io.everyonecodes_consolidation2.drivers.Repositorys;
import io.everyonecodes_consolidation2.drivers.Data.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends MongoRepository<Driver, String > {

    Driver findByUsername(String username);
}

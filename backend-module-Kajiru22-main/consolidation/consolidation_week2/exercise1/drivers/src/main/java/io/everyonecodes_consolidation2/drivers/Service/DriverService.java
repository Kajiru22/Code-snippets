package io.everyonecodes_consolidation2.drivers.Service;

import io.everyonecodes_consolidation2.drivers.Data.Driver;
import io.everyonecodes_consolidation2.drivers.Repositorys.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver getDriverById(String id) {
        return driverRepository.findById(id).orElse(null);
    }

    public Optional<Driver> available(String id) {
       var driver = driverRepository.findById(id);
       driver.get().setAvailable(true);
       return driver;
    }

    public Optional<Driver> notAvailable(String id) {
        var driver = driverRepository.findById(id);
        driver.get().setAvailable(false);
        return driver;
    }

}


package io.everyonecodes_consolidation2.drivers.Endpoints;

import io.everyonecodes_consolidation2.drivers.Data.Driver;
import io.everyonecodes_consolidation2.drivers.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/drivers")
public class DriverEndpoint {

    @Autowired
    private DriverService driverService;

    @PostMapping
    public Driver createDriver(@Valid @RequestBody Driver driver) {
        return driverService.createDriver(driver);
    }

    @GetMapping("/{id}")
    @Secured("ROLE_DRIVER")
    public Driver getDriverById(@PathVariable String id) {
        return driverService.getDriverById(id);
    }

    @PutMapping("/{id}/available")
    @Secured("ROLE_DRIVER")
    public Optional<Driver> setDriverAsAvailable(@PathVariable String id) {
         return driverService.available(id);
    }

    @PutMapping("/{id}/unavailable")
    @Secured("ROLE_DRIVER")
    public ResponseEntity<Void> setDriverAsUnavailable(@PathVariable String id) {
        driverService.notAvailable(id);
        return ResponseEntity.noContent().build();
    }
}

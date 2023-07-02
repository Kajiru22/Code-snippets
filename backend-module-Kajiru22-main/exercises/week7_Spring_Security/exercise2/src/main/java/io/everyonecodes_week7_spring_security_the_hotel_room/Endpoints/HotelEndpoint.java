package io.everyonecodes_week7_spring_security_the_hotel_room.Endpoints;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelEndpoint {

    @GetMapping
    public String get() {
        return "Welcome to the Hotel!";
    }

    @GetMapping("/room")
    @Secured("ROLE_CUSTOMER")
    public String user() {
        return "Welcome to your Room!";
    }

}

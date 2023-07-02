package io.everyonecodes.booster.evaluation.udemy_users.endpoint;

import io.everyonecodes.booster.evaluation.udemy_users.presitance.domain.User;
import io.everyonecodes.booster.evaluation.udemy_users.service.UserService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserEndpoint {

    private final UserService userService;

    public UserEndpoint(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @Secured("ROLE_APP")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/{name}")
    @Secured("ROLE_APP")
    public void deleteUser(@PathVariable String name) {
        userService.deleteUser(name);
    }
}

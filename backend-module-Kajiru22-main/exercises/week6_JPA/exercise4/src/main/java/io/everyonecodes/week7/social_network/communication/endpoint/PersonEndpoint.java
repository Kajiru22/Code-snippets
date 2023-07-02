package io.everyonecodes.week7.social_network.communication.endpoint;

import io.everyonecodes.week7.social_network.domain.PersonDTO;
import io.everyonecodes.week7.social_network.logic.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonEndpoint {
    private final PersonService personService;

    public PersonEndpoint(PersonService personService) {this.personService = personService;}

    @GetMapping
    List<PersonDTO> getAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping
    PersonDTO postPerson(@RequestBody PersonDTO dto) {
        return personService.savePerson(dto);
    }

    @PutMapping("/{id1}/friend/{id2}")
    void addFriendByIds(@PathVariable Long id1, @PathVariable Long id2) {
        personService.addFriendByIds(id1, id2);
    }

    @PutMapping("/{id1}/unfriend/{id2}")
    void unfriendByIds(@PathVariable Long id1, @PathVariable Long id2) {
        personService.unFriendByIds(id1, id2);
    }

}

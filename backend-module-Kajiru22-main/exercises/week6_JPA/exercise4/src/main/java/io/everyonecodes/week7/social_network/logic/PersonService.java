package io.everyonecodes.week7.social_network.logic;

import io.everyonecodes.week7.social_network.domain.Person;
import io.everyonecodes.week7.social_network.domain.PersonDTO;
import io.everyonecodes.week7.social_network.domain.PersonToDTOTranslator;
import io.everyonecodes.week7.social_network.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final PersonToDTOTranslator personToDTOTranslator;

    public PersonService(PersonRepository personRepository, PersonToDTOTranslator personToDTOTranslator) {
        this.personRepository = personRepository;
        this.personToDTOTranslator = personToDTOTranslator;
    }
    public List<PersonDTO> getAllPersons() {
        return personRepository.findAll().stream().map(personToDTOTranslator::fromPerson).collect(Collectors.toList());
    }

    public PersonDTO savePerson(PersonDTO dto) {
        return personToDTOTranslator.fromPerson(personRepository.save(personToDTOTranslator.fromDTO(dto)));
    }

    public void addFriendByIds(Long id1, Long id2) {
        Optional<Person> oPerson1 = personRepository.findById(id1);
        Optional<Person> oPerson2 = personRepository.findById(id2);
        oPerson2.ifPresent(friend -> oPerson1.ifPresent(person1 -> {
            person1.addFriend(friend);
            personRepository.save(person1);
            friend.addFriend(person1);
            personRepository.save(friend);
        }));
    }

    public void unFriendByIds(Long id1, Long id2) {
        Optional<Person> oPerson1 = personRepository.findById(id1);
        Optional<Person> oPerson2 = personRepository.findById(id2);
        oPerson2.ifPresent(person2 -> oPerson1.ifPresent(person1 -> {
            person1.unFriend(person2);
            person2.unFriend(person1);
            personRepository.save(person1);
            personRepository.save(person2);
        }));
    }
}

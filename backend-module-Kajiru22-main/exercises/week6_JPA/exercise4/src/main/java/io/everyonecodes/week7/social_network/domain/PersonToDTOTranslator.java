package io.everyonecodes.week7.social_network.domain;

import org.springframework.stereotype.Component;

@Component
public class PersonToDTOTranslator {
    public Person fromDTO(PersonDTO dto) {
        Person person = new Person();
        person.setId(dto.getId());
        person.setName(dto.getName());
        if (dto.getFriendNames() != null) {
            for (String friend : dto.getFriendNames()) {
                Person f = new Person();
                f.setName(friend);
                person.addFriend(f);
            }
        }
        return person;
    }

    public PersonDTO fromPerson(Person person) {
        PersonDTO dto = new PersonDTO();
        dto.setId(person.getId());
        dto.setName(person.getName());
        if (person.getFriends() != null) {
            for (Person friend : person.getFriends()) {
                String f = friend.getName();
                dto.addFriend(f);
            }
        }
        return dto;
    }
}

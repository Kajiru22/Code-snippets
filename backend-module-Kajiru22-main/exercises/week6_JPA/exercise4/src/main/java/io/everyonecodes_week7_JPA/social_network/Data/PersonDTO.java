package io.everyonecodes_week7_JPA.social_network.Data;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

public class PersonDTO {

    private Long id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<String> friends;
}

package io.everyonecodes_week6_JPA.phone_book.Endpoints;

import io.everyonecodes_week6_JPA.phone_book.Data.Contact;
import io.everyonecodes_week6_JPA.phone_book.Service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactEndpoint {

    private final ContactService contactService;

    public ContactEndpoint(ContactService contactService) {
        this.contactService = contactService;
    }
    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactService.createContact(contact);
    }

    @GetMapping
    public List<Contact> showAll() {
        return contactService.showAllContacts();
    }

    @GetMapping("/postalcodes/{postalcodes}")
    public List<Contact> showByPostalCode(@PathVariable String postalCode) {
        return contactService.showByPostalCode(postalCode);
    }
}

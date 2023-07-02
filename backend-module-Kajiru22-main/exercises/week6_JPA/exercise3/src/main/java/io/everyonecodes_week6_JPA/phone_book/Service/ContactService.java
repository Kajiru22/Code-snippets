package io.everyonecodes_week6_JPA.phone_book.Service;

import io.everyonecodes_week6_JPA.phone_book.Data.Contact;
import io.everyonecodes_week6_JPA.phone_book.Repositorys.AddressRepository;
import io.everyonecodes_week6_JPA.phone_book.Repositorys.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactService {

    private final ContactRepository contactRepository;

    private final AddressRepository addressRepository;

    public ContactService(ContactRepository contactRepository, AddressRepository addressRepository) {
        this.contactRepository = contactRepository;
        this.addressRepository = addressRepository;
    }

    public Contact createContact(Contact contact) {
        addressRepository.save(contact.getAddress());
        return contactRepository.save(contact);
    }

    public List<Contact> showAllContacts() {
        return contactRepository.findAll();
    }

    public List<Contact> showByPostalCode(String postalCode) {
        return contactRepository.findByPostalCode(postalCode);
    }

}

package br.com.erudio.br.com.erudio.services;

import br.com.erudio.br.com.erudio.models.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Finding one person");

        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setAddress("Campina Grande");
        person.setFirstName("Pedro");
        person.setLastName("Azevedo");
        person.setGender("Male");

        return person;
    }
}
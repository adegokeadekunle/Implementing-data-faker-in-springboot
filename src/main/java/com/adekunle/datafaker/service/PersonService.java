package com.adekunle.datafaker.service;


import com.adekunle.datafaker.entity.Person;
import com.adekunle.datafaker.repositories.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> getAllPeople(){
        return personRepository.findAll();
    }

    public Person findByFirstAndLastName(String firstName, String lastName){

        Person person =  personRepository.findByFirstNameEqualsAndLastNameEquals(firstName, lastName);
        return person;

    }
}

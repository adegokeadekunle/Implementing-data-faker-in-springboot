package com.adekunle.datafaker.service;


import com.adekunle.datafaker.entity.Person;
import com.adekunle.datafaker.repositories.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public List<Person> getAllPeople(){
        return personRepository.findAll();
    }

    @Override
    public Person findByFirstAndLastName(String firstName, String lastName){

        return personRepository.findByFirstNameEqualsAndLastNameEquals(firstName, lastName);

    }
}

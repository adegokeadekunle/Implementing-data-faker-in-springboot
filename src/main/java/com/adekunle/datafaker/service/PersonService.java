package com.adekunle.datafaker.service;

import com.adekunle.datafaker.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPeople();

    Person findByFirstAndLastName(String firstName, String lastName);
}

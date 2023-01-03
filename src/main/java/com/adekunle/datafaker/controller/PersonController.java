package com.adekunle.datafaker.controller;

import com.adekunle.datafaker.entity.Person;
import com.adekunle.datafaker.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/all")
    public List<Person> getAll(){
        return personService.getAllPeople();
    }

    @GetMapping("/by_name")
    public Person getByFirstAndLastName(String firstName, String lastName){
        return personService.findByFirstAndLastName(firstName, lastName);
    }

}

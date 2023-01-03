package com.adekunle.datafaker.service;

import com.adekunle.datafaker.entity.Address;
import com.adekunle.datafaker.entity.Person;
import com.adekunle.datafaker.repositories.PersonRepository;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor
public class JavaFakerDataLoaderServiceImpl implements CommandLineRunner {

    private final PersonRepository personRepository;
    private final Faker javaFaker;


    @Override
    public void run(String... args) throws Exception {

        List<Person> listOfPersons = IntStream.rangeClosed(1, 100)  // this will save list of 100 random persons
                .mapToObj(p -> new Person(

                        javaFaker.name().firstName(),
                        javaFaker.name().lastName(),
                        javaFaker.phoneNumber().phoneNumber(),
                        javaFaker.internet().emailAddress(),
                        new Address(
                                javaFaker.address().streetAddress(),
                                javaFaker.address().city(),
                                javaFaker.address().state(),
                                javaFaker.address().zipCode()
                        )
                )).collect(Collectors.toList());

        personRepository.saveAll(listOfPersons);
    }
}

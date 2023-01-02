package com.adekunle.datafaker.repositories;

import com.adekunle.datafaker.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    Person findByFirstNameEqualsAndLastNameEquals(String firstName, String lastName);
}

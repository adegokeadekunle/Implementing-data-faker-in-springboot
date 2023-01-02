package com.adekunle.datafaker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="address_id", referencedColumnName = "id")
    private Address address;

    public Person() {
    }

    public Person(String firstName, String lastName, String phoneNumber, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

}

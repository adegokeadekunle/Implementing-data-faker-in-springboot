package com.adekunle.datafaker.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaFakerConfig {

    @Bean
    Faker faker(){

        return new Faker();
    }
}

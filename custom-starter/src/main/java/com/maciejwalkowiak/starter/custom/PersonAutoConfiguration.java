package com.maciejwalkowiak.starter.custom;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class PersonAutoConfiguration {

    @Bean
    PersonService personService() {
        return new PersonServiceImpl();
    }
}

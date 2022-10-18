package com.example.demo;

import com.maciejwalkowiak.starter.custom.PersonServiceImpl;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private final PersonServiceImpl personService;
    private final FooServiceImpl fooService;

    // injecting `personService` that comes from autoconfiguration, by actual type ends up with:
    // "No qualifying bean of type 'com.maciejwalkowiak.starter.custom.PersonServiceImpl'"
    MyComponent(PersonServiceImpl personService, FooServiceImpl fooService) {
        this.personService = personService;
        this.fooService = fooService;
    }

    PersonServiceImpl getPersonService() {
        return personService;
    }

    FooServiceImpl getFooService() {
        return fooService;
    }
}

package com.pedrocavalero.tutorial.springreactive.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocavalero.tutorial.springreactive.demo.model.Person;
import com.pedrocavalero.tutorial.springreactive.demo.repositories.PersonRespository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRespository personRespository;
    @GetMapping
    public Flux<Person> index() {
        return personRespository.findAll();
    }
}

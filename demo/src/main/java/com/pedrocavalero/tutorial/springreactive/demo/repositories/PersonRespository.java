package com.pedrocavalero.tutorial.springreactive.demo.repositories;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import com.pedrocavalero.tutorial.springreactive.demo.model.Person;

import reactor.core.publisher.Flux;

public interface PersonRespository extends ReactiveCassandraRepository<Person, String> {
    Flux<Person> findByName(String name);
}
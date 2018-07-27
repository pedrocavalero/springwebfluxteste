package com.pedrocavalero.tutorial.springreactive.demo.controller;

import static org.springframework.web.reactive.function.server.RequestPredicates.method;
import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;

import com.pedrocavalero.tutorial.springreactive.demo.model.Person;
import com.pedrocavalero.tutorial.springreactive.demo.repositories.PersonRespository;

@Configuration
public class RoutesConfiguration {

	@Bean
	RouterFunction<?> routes(PersonRespository personRespository) {
		return nest(path("/person"),
				
				route(RequestPredicates.GET("/{id}"),
						request -> ok().body(personRespository.findById(request.pathVariable("id")), Person.class))
				
				.andRoute(method(HttpMethod.POST), 
						request -> {
									personRespository.insert(request.bodyToMono(Person.class)).subscribe();
									return ok().build();
								})
				);
	}
}
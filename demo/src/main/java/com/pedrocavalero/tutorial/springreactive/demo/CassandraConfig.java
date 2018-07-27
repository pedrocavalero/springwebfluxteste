package com.pedrocavalero.tutorial.springreactive.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {
 
    @Override
    protected String getKeyspaceName() {
        return "webflux";
    }
 

}
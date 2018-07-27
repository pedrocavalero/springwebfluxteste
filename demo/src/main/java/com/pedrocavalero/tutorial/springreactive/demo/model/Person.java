package com.pedrocavalero.tutorial.springreactive.demo.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Person {
    
	@PrimaryKeyColumn(
			name = "id",
			ordinal=0,
			type=PrimaryKeyType.PARTITIONED) 
    private int id;
	@PrimaryKeyColumn(
			name = "name",
			ordinal=2,
			type=PrimaryKeyType.PARTITIONED) 
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

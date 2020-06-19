package com.javaguy.jdbc.model;

import org.springframework.data.annotation.Id;

public class Employee {
	@Id
	private Long id;
	private String name;
	
	public Employee(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

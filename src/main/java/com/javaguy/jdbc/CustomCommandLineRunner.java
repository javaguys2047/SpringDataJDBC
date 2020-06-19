package com.javaguy.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javaguy.jdbc.model.Employee;
import com.javaguy.jdbc.repository.EmployeeRepo;

@Component
public class CustomCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		Employee e = new Employee("New Employee");
		repo.save(e);
		
		System.out.println(e);
	}

}

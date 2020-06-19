package com.javaguy.jdbc.repository;

import org.springframework.data.repository.CrudRepository;

import com.javaguy.jdbc.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long>{

}

package com.dbs.springmvcapp.repository;

import com.dbs.springmvcapp.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    public Optional<Employee> findByName(String name);
}
package com.microservice.glbexp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.glbexp.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}

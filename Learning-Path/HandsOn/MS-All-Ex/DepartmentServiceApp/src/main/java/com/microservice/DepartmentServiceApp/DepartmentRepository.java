package com.microservice.DepartmentServiceApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>{

	Department findByDepartmentId(int departmentId);

}

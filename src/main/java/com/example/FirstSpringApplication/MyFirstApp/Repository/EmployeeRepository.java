package com.example.FirstSpringApplication.MyFirstApp.Repository;

import com.example.FirstSpringApplication.MyFirstApp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package com.example.DemoApplication.Repository;

import com.example.DemoApplication.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}

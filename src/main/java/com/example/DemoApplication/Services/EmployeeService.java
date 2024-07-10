package com.example.DemoApplication.Services;

import com.example.DemoApplication.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> fetchAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployeeById(Long id, Employee employee);
    String deleteById(Long id);
}

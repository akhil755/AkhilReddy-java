package com.example.FirstSpringApplication.MyFirstApp.Services;

import com.example.FirstSpringApplication.MyFirstApp.Entity.Employee;

import java.util.List;

public interface EmpServices {

    Employee saveEmployee(Employee employee);
    List<Employee> fetchAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployeeById(Long id, Employee employee);
    String deleteDepartmentById(Long id);
}

package com.example.FirstSpringApplication.MyFirstApp.Controller;

import com.example.FirstSpringApplication.MyFirstApp.Entity.Employee;
import com.example.FirstSpringApplication.MyFirstApp.Services.EmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmpServices empServices;

    @PostMapping("/employee")
    public Employee saveEmployee(Employee employee){
        return empServices.saveEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(Employee employee){
        return empServices.fetchAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return empServices.getEmployeeById(id);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable Long id, Employee employee){
        return empServices.updateEmployeeById(id,employee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteDepartmentById(@PathVariable Long id){
        return empServices.deleteDepartmentById(id);
    }
}

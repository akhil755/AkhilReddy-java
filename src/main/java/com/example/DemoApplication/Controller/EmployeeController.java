package com.example.DemoApplication.Controller;

import com.example.DemoApplication.Entity.Employee;
import com.example.DemoApplication.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.fetchAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployeeById(@PathVariable("id") Long id, Employee employee){
        return employeeService.updateEmployeeById(id,employee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteById(@PathVariable("id") Long id){
        return employeeService.deleteById(id);
    }
}

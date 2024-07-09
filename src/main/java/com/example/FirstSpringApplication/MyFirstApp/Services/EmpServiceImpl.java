package com.example.FirstSpringApplication.MyFirstApp.Services;

import com.example.FirstSpringApplication.MyFirstApp.Entity.Employee;
import com.example.FirstSpringApplication.MyFirstApp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpServices{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        List<Employee> Allemployees = employeeRepository.findAll();
        return Allemployees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()){
            return employee.get();
        }
        return null;
    }

    @Override
    public Employee updateEmployeeById(Long id, Employee employee) {
        Optional<Employee> employee1 = employeeRepository.findById(id);
        if (employee1.isPresent()){
            Employee originalEmployee = employee1.get();
            if (Objects.nonNull(employee.getEmpName()) && !"".equalsIgnoreCase(employee.getEmpName())){
                originalEmployee.setEmpName(employee.getEmpName());
            }
            if (Objects.nonNull(employee.getEmpSalary()) && employee.getEmpSalary()!=0){
                originalEmployee.setEmpSalary(employee.getEmpSalary());
            }
            return employeeRepository.save(originalEmployee);
        }
        return null;
    }

    @Override
    public String deleteDepartmentById(Long id) {
        if (employeeRepository.findById(id).isPresent()){
            employeeRepository.deleteById(id);
            return "Employee deleted successfully";
        }
        return "Employee not found";
    }
}
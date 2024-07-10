package com.example.DemoApplication.Services;

import com.example.DemoApplication.Entity.Employee;
import com.example.DemoApplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService  {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        List<Employee> allEmployees = employeeRepository.findAll();
        return allEmployees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        if (byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public Employee updateEmployeeById(Long id, Employee employee) {
        Optional<Employee> byIdAvailable = employeeRepository.findById(id);
        if (byIdAvailable.isPresent()){
            Employee originalEmployee = byIdAvailable.get();
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
    public String deleteById(Long id) {
        Optional<Employee> byId_  = employeeRepository.findById(id);
        if (byId_.isPresent()){
            employeeRepository.deleteById(id);

            return "Employee delete successfully";
        }
        return "No Employee found with that id";
    }
}

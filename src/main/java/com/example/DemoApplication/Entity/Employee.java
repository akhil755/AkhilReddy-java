package com.example.DemoApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(generator = "increment")
    private Long empid;
    private String empName;
    private float empSalary;

    public Employee(){

    }
    public Employee(Long empid,String empName, float empSalary){
        this.empid=empid;
        this.empName=empName;
        this.empSalary=empSalary;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }
}

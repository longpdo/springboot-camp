package com.adorsys.springbootcamp.service;

import com.adorsys.springbootcamp.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public List<Employee> getEmployees();

    public Employee getEmployee(Long id);

    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void removeEmployee(Long id);
}

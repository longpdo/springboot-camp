package com.adorsys.springbootcamp.service;

import com.adorsys.springbootcamp.entity.Employee;
import com.adorsys.springbootcamp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee is not available."));
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void removeEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
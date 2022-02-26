package com.example.employeeproject2.service;


import com.example.employeeproject2.dao.EmployeeRepository;
import com.example.employeeproject2.model.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    private EmployeeRepository repository;


    public void createEmployee(Long id, Employee employee) {
        repository.createEmployee(id, employee);
    }

    public Employee getEmployee(Long id) {
        return repository
                .getEmployeeMap()
                .get(id);
    }

    public HashMap<Long, Employee> getEmployee() {
        return repository.getEmployeeMap();
    }

    public void deleteEmployee(Long id) {
        repository
                .getEmployeeMap()
                .remove(id);
    }

    public void updateEmployee(Long id, Employee employee) {
        repository.createEmployee(id, employee);
    }

    public void updateEmployeeName(Long id, String name) {
        Employee employee = repository
                .getEmployeeMap()
                .get(id);
        employee.setName(name);
    }

    public void updateEmployeeSurname(Long id, String surname) {
        Employee employee = repository
                .getEmployeeMap()
                .get(id);
        employee.setSurname(surname);
    }

    public void updateEmployeeAddress(Long id, String address) {
        Employee employee = repository
                .getEmployeeMap()
                .get(id);
        employee.setAddress(address);

    }
}

package com.example.employeeproject2.dao;


import com.example.employeeproject2.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
@AllArgsConstructor
@Data
public class EmployeeRepository {

    private HashMap<Long, Employee> employeeMap;

    public void createEmployee(Long id, Employee employee) {
        employeeMap.put(id, employee);
        System.out.println("Employee saved in map");

    }

}

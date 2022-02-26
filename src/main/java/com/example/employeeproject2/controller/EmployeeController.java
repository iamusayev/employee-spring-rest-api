package com.example.employeeproject2.controller;


import com.example.employeeproject2.model.Employee;
import com.example.employeeproject2.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("v1/employee")
public class EmployeeController {

    private EmployeeService service;

    @PostMapping
    public void createEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        service.createEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return service.getEmployee(id);
    }

    @GetMapping("/{id}")
    public HashMap<Long, Employee> getEmployee() {
        return service.getEmployee();
    }

    @PutMapping("{id}")
    public void updateEmployee(@PathVariable Long id,
                               @RequestBody Employee employee) {
        service.updateEmployee(id, employee);
    }

    @PatchMapping("/{id}/name")
    public void updateEmployeeName(@PathVariable Long id,
                                   @RequestParam(value = "value") String name) {
        service.updateEmployeeName(id, name);
    }

    @PatchMapping("/{id}/surname")
    public void updateEmployeeSurname(@PathVariable Long id,
                                      @RequestParam(value = "value") String surname) {
        service.updateEmployeeSurname(id, surname);
    }

    @PatchMapping("/{id}/surname")
    public void updateEmployeeAddress(@PathVariable Long id,
                                      @RequestParam(value = "value") String address) {
        service.updateEmployeeAddress(id, address);
    }


}

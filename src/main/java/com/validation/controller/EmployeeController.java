package com.validation.controller;

import com.validation.controller.dto.EmployeeDTO;
import com.validation.entity.Employee;
import com.validation.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    public  EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid EmployeeDTO employeeDTO) {
        System.out.println("en @postmapping");
        return new ResponseEntity<>(this.employeeService.saveEmployee(employeeDTO), HttpStatus.CREATED);
    }


}

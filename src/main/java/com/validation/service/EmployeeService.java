package com.validation.service;

import com.validation.controller.dto.DepartmentDTO;
import com.validation.controller.dto.EmployeeDTO;
import com.validation.entity.Departament;
import com.validation.entity.Employee;
import com.validation.persistence.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) { //constructor de la clase EmployeeService
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(EmployeeDTO employeeDTO){
        Employee employee = Employee.builder()
                .name(employeeDTO.getName())
                .lastName(employeeDTO.getLastName())
                .email(employeeDTO.getEmail())
                .phone(employeeDTO.getPhone())
                .age(employeeDTO.getAge())
                .height(employeeDTO.getHeight())
                .married(employeeDTO.isMarried())
                .dateOfBirth(employeeDTO.getDateOfBirth())
                .departament(Departament.builder()
                        .name(employeeDTO.getDepartmentDTO().getName())
                        .city(employeeDTO.getDepartmentDTO().getCity())
                        .build())
                .build();
        return this.employeeRepository.save(employee);
    }
}

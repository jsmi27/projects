package com.example.simplerestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

// Import the above-defined classes to use the properties of those classes
import com.example.simplerestapi.EmployeeDAO;
import com.example.simplerestapi.Employee;

// Creating the REST controller
@RestController
@RequestMapping(path = "/employees")
public class SimplerestapiController {
    @Autowired
    private EmployeeDAO employeeDao;

    // Implementing a GET method to get the list of all the employees
    @GetMapping(
            path = "/",
            produces = "application/json")

    String getEmployees()
    {
        return employeeDao.getAllEmployees();
    }

    // Create a POST method to add an employee to the list
    @PostMapping(
            path = "/",
            consumes = "application/json",
            produces = "application/json")

    public ResponseEntity<Object> addEmployee(
            @RequestBody Employee employee)
    {
        URI location
                = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        employee.getId())
                .toUri();

        return ResponseEntity
                .created(location)
                .build();
    }
}


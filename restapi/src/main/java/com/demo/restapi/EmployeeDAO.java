package com.demo.restapi;

import org.springframework.stereotype.Repository;

// Importing the employees class to use the defined properties in this class
//import com.demo.restapi.EmployeeList;

@Repository
// Class to create a list of employees
public class EmployeeDAO {
    private static EmployeeList list = new EmployeeList();

    // This static block is executed before executing the main block
    static
    {
        // Creating a few employees and adding them to the list
        list.getEmployeeList().add(
                new Employee(
                        1,
                        "Google"));
        list.getEmployeeList().add(
                new Employee(
                        2,
                        "Microsoft"));
        list.getEmployeeList().add(
                new Employee(
                        3,
                        "Amazon"));
        list.getEmployeeList().add(
                new Employee(
                        4,
                        "Apple"));
    }

    // Method to return the list
    public EmployeeList getAllEmployees()
    {
        return list;
    }

    // Method to add an employee to the employees list
    public void addEmployee(Employee employee)
    {
        list.getEmployeeList().add(employee);
    }
}
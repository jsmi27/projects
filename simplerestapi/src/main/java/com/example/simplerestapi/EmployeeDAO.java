package com.example.simplerestapi;

import org.springframework.stereotype.Repository;

// Importing the employees class to use the defined properties in this class
//import com.demo.restapi.EmployeeList;

@Repository
// Class to create a list of employees
public class EmployeeDAO {
    //private static EmployeeList list = new EmployeeList();
    private static Employee employee1 = new Employee(1, "Google Employees");
    private static Employee employee2 = new Employee(2, "Microsoft Employees");
    private static Employee employee3 = new Employee(3, "Amazon Employees");
    private static Employee employee4 = new Employee(4, "Apple Employees");

    public String getAllEmployees()
    {
        String employee = employee1.getId() + " " + employee1.getFirstName() + System.lineSeparator()
                + employee2.getId() + " " + employee2.getFirstName() + System.lineSeparator()
                + employee3.getId() + " " + employee3.getFirstName() + System.lineSeparator()
                + employee4.getId() + " " + employee4.getFirstName() ;
        return employee;
    }
}

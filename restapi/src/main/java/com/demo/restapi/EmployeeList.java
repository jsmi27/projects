package com.demo.restapi;

import java.util.ArrayList;
import java.util.List;

// Class to store the list of all the employees in an Array List
public class EmployeeList {

    private List<Employee> employeeList;

    // Method to return the list of employees
    public List<Employee> getEmployeeList()
    {
        if (employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }
    public void setEmployeeList(List<Employee> employeeList)
    {
        this.employeeList = employeeList;
    }
}
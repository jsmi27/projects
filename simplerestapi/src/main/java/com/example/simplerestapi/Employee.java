package com.example.simplerestapi;

// Creating an entity Employee
public class Employee {

    //Default Constructor
    public Employee() {
    }

    // Parameterized Constructor to assign the values to the properties of the entity
    public Employee(Integer id, String firstName)
    {
        this.id = id;
        this.firstName = firstName;
    }
    private Integer id;
    private String firstName;

    // Overriding the toString method to find all the values
    @Override
    public String toString()
    {
        return "Employee [id=" + id + ", firstName=" + firstName + "]";
    }

    // Getters and setters of the properties
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(
            String firstName)
    {
        this.firstName = firstName;
    }
}

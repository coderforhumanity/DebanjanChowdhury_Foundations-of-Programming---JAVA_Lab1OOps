package com.lab1oops.debanjan;

public class Employee {

    String firstName, lastName;

    protected Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName()
    {
        return firstName;
    }

    protected String getlastName()
    {
        return lastName;
    }
}

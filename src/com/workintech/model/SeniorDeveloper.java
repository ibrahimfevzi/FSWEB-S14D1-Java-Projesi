package com.workintech.model;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, float salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("SeniorDeveloper is working. They are the experts!");
        setSalary(getSalary() + 3000); // Increase salary for a senior developer's work
    }
}

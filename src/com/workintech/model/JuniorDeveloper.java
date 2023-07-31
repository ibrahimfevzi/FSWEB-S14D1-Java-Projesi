package com.workintech.model;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, float salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("JuniorDeveloper is working. Keep an eye on them!");
        setSalary(getSalary() + 1000); // Increase salary for a junior developer's work
    }
}

package com.workintech.model;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, float salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("MidDeveloper is working. They are getting experienced!");
        setSalary(getSalary() + 2000); // Increase salary for a mid-level developer's work
    }
}

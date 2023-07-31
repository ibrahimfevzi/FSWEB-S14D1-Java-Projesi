package com.workintech.model;

public class Employee {

    private int id;
    private String name;
    private float salary;

    public Employee(int id, String name, float salary) {
        if (id <= 0) {
            this.id = 0;
        }
        else {
            this.id = id;
        }
        if (name == null) {
            this.name = "";
        }
        else {
            this.name = name;
        }
        if (salary <= 0) {
            this.salary = 0;
        }
        else {
            this.salary = salary;
        }
    }

    public Employee() {
        this(0, "", 0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public  void work() {
        System.out.println("Employee starts to working");
    }




}

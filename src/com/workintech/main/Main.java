package com.workintech.main;

import com.workintech.model.Circle;
import com.workintech.model.Cylinder;
import com.workintech.model.Rectangle;
import com.workintech.model.Cuboid;
import com.workintech.model.HRManager;
import com.workintech.model.JuniorDeveloper;
import com.workintech.model.MidDeveloper;
import com.workintech.model.SeniorDeveloper;

public class Main {
    public static void main(String[] args) {

        System.out.println("=================SİLİNDİR=================");

        Circle circle = new Circle(3.75f);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55f, 7.25f);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("=================HAVUZ ALANI=================");

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());


        System.out.println("=================DEVELOPER COMPANY=================");
        // Create an HRManager
        HRManager hrManager = new HRManager(1, "Tunca Özdemir", 50000);

        // Create some developers
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(101, "İbrahim", 20000);
        MidDeveloper midDeveloper = new MidDeveloper(102, "Kerem", 30000);
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(103, "Meyra", 40000);

        // Add developers to HRManager
        hrManager.addEmployee(juniorDeveloper);
        hrManager.addEmployee(midDeveloper);
        hrManager.addEmployee(seniorDeveloper);

        // Print employee information
        System.out.println("HR Manager: " + hrManager.getName() + ", Salary: " + hrManager.getSalary());
        System.out.println("Junior Developer: " + juniorDeveloper.getName() + ", Salary: " + juniorDeveloper.getSalary());
        System.out.println("Mid Developer: " + midDeveloper.getName() + ", Salary: " + midDeveloper.getSalary());
        System.out.println("Senior Developer: " + seniorDeveloper.getName() + ", Salary: " + seniorDeveloper.getSalary());

        // Test work method
        juniorDeveloper.work();
        midDeveloper.work();
        seniorDeveloper.work();

        // Print updated salary after work
        System.out.println("Updated Junior Developer Salary: " + juniorDeveloper.getSalary());
        System.out.println("Updated Mid Developer Salary: " + midDeveloper.getSalary());
        System.out.println("Updated Senior Developer Salary: " + seniorDeveloper.getSalary());
    }

    }



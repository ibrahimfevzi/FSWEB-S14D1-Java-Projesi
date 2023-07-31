package com.workintech.model;

public class Circle {

    private float radius;

    public Circle(float radius) {

        if (radius <= 0) {
            this.radius = 0;
        }
        else {
            this.radius = radius;
        }
    }

    public Circle() {
        this(0);
    }

    public float getRadius() {
        return radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }



}

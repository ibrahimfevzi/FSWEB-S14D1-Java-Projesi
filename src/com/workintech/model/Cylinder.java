package com.workintech.model;

public class Cylinder extends Circle {

    private float height;

    public Cylinder(float radius, float height) {
        super(radius);
        if (height <= 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public Cylinder() {
        this(0, 0);
    }

    public float getHeight() {
        return height;
    }

    public float getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", height=" + height +
                '}';
    }


}

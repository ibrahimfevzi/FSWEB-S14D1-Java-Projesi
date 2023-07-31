package com.workintech.model;

public class Cuboid extends Rectangle {

    private float height;

    public Cuboid(float width, float length, float height) {
        super(width, length);
        if (height <= 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public Cuboid() {
        this(0, 0, 0);
    }

    public float getHeight() {
        return height;
    }

    public float getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                ", height=" + height +
                '}';
    }


}

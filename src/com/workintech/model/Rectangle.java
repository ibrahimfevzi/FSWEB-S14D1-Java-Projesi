package com.workintech.model;

public class Rectangle {

    private float width;
    private float length;

    public Rectangle(float width, float length) {
        if (width <= 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }
        if (length <= 0) {
            this.length = 0;
        }
        else {
            this.length = length;
        }
    }

    public Rectangle() {
        this(0, 0);
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public float getArea() {
        return width * length;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

}

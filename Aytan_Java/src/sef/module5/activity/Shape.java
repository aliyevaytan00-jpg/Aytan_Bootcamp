package sef.module5.activity;


public abstract class Shape {

    public String color;

    public Shape() {
    }

    // Abstract method for calculating area
    public abstract double calculateArea(double length, double breadth, double radius);

    // Abstract method for calculating perimeter
    public abstract double calculatePerimeter(double length, double breadth, double radius);

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}

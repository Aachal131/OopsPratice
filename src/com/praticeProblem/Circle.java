package com.praticeProblem;

public class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        // Create a Circle object
        Circle circle1 = new Circle(5.0);

        // Calculate and print area and circumference
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println("Circumference: " + circle1.calculateCircumference());
    }
}

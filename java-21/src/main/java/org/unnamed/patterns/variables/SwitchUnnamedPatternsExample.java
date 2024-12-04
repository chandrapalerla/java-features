package org.unnamed.patterns.variables;

public class SwitchUnnamedPatternsExample {
    public static void main(String[] args) {
        Shape shape = new Circle(5);

        String result = switch (shape) {
            case Circle(double radius) -> "Circle with radius " + radius;
            case Rectangle(double length, double _) -> "Rectangle with length " + length;
            case Triangle(double _, double height) -> "Triangle with height " + height;
        };

        System.out.println(result);  // Output: Circle with radius 5.0
    }
}

sealed interface Shape permits Circle, Rectangle, Triangle {}

record Circle(double radius) implements Shape {}
record Rectangle(double length, double width) implements Shape {}
record Triangle(double base, double height) implements Shape {}

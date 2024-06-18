package inheritance;
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();

    // Concrete method to display shape
    void display() {
        System.out.println("Displaying shape");
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the calculateArea method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the calculateArea method
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Circle object
        Shape circle = new Circle(5.0);
        circle.display();
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Create a Rectangle object
        Shape rectangle = new Rectangle(4.0, 6.0);
        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

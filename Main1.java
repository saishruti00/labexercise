package inheritance;
abstract class Shape1 {
    // Abstract method to calculate area
    abstract double calculateArea();

    // Concrete method to display shape
    void display() {
        System.out.println("Displaying shape");
    }
}

class Circle1 extends Shape {
    private double radius;

    // Constructor
    public Circle1(double radius) {
        this.radius = radius;
    }

    // Implement the calculateArea method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 extends Shape1 {
    private double length;
    private double width;

    // Constructor
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the calculateArea method
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(6.0);
        circle.display();
        System.out.println("Area of Circle1: " + circle.calculateArea());

        // Create a Rectangle object
        Shape rectangle = new Rectangle(5.0, 7.0);
        rectangle.display();
        System.out.println("Area of Rectangle1: " + rectangle.calculateArea());

	}

}

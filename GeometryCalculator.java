package array;

public class GeometryCalculator {
	 // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GeometryCalculator calculator = new GeometryCalculator();
	        
	        // Calculate area of a rectangle
	        double rectangleArea = calculator.calculateArea(5.0, 4.0);
	        System.out.println("Area of the rectangle: " + rectangleArea);
	        
	        // Calculate area of a circle
	        double circleArea = calculator.calculateArea(3.0);
	        System.out.println("Area of the circle: " + circleArea);
	        
	        // Calculate area of a triangle
	        double triangleArea = calculator.calculateArea(4.0, 3.0, true);
	        System.out.println("Area of the triangle: " + triangleArea);

	}

}

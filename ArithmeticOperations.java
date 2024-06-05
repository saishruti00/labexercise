package day7;

public class ArithmeticOperations {
	 public static int add(int num1, int num2) {
	        return num1 + num2;
	    }

	    // Function to perform subtraction
	    public static int subtract(int num1, int num2) {
	        return num1 - num2;
	    }

	    // Function to perform multiplication
	    public static int multiply(int num1, int num2) {
	        return num1 * num2;
	    }

	    // Function to perform division
	    public static double divide(int num1, int num2) {
	        if (num2 != 0) {
	            return (double) num1 / num2;
	        } else {
	            System.out.println("Division by zero is not allowed.");
	            return Double.NaN; // Return 'Not a Number' if division by zero
	        }
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10;
        int number2 = 5;

        // Calling the functions and storing the results
        int additionResult = add(number1, number2);
        int subtractionResult = subtract(number1, number2);
        int multiplicationResult = multiply(number1, number2);
        double divisionResult = divide(number1, number2);

        // Printing the results
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);

	}

}

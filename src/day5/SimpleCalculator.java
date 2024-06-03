package day5;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user to enter the operation
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;

        // Perform the chosen operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);

	}

}

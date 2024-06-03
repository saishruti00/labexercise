package day5;
import java.util.Scanner;
public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate factorial using iterative approach
        long factorialIterative = factorialIterative(number);
        System.out.println("Factorial (Iterative) of " + number + " is: " + factorialIterative);

        // Calculate factorial using recursive approach
        long factorialRecursive = factorialRecursive(number);
        System.out.println("Factorial (Recursive) of " + number + " is: " + factorialRecursive);
    }

    // Iterative approach to calculate factorial
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive approach to calculate factorial
    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * factorialRecursive(n - 1); // Recursive case
        }
	}

}

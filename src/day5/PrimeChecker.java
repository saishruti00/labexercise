package day5;
import java.util.Scanner;
public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrime(number);

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 and numbers less than 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, number is prime

	}

}

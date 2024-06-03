package day5;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Prompt user to enter the number of terms
	        System.out.print("Enter the number of terms: ");
	        int n = scanner.nextInt();

	        // Generate and display the Fibonacci series
	        generateFibonacciSeries(n);
	    }

	    public static void generateFibonacciSeries(int n) {
	        int firstTerm = 0;
	        int secondTerm = 1;

	        System.out.print("Fibonacci Series: ");

	        for (int i = 1; i <= n; ++i) {
	            System.out.print(firstTerm + " ");

	            // Compute the next term
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	}

}

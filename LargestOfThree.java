package day7;

public class LargestOfThree {

		// TODO Auto-generated method stub
		public static int findLargest(int num1, int num2, int num3) {
	        int largest;

	        if (num1 >= num2 && num1 >= num3) {
	            largest = num1;
	        } else if (num2 >= num1 && num2 >= num3) {
	            largest = num2;
	        } else {
	            largest = num3;
	        }

	        return largest;
	    }

		public static void main(String[] args) {
	        // Example numbers
	        int number1 = 10;
	        int number2 = 20;
	        int number3 = 30;

	        // Calling the function and storing the result
	        int largestNumber = findLargest(number1, number2, number3);

	        // Printing the result
	        System.out.println("The largest number is: " + largestNumber);

	}

}

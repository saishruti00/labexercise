package array;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5};

        // Call the method to calculate the sum
        int sum = calculateSum(numbers);

        // Print the result
        System.out.println("The sum of all elements in the array is: " + sum);
    }

    /**
     * This method calculates the sum of all elements in the given integer array.
     *
     * @param array the integer array whose elements need to be summed
     * @return the sum of all elements in the array
     */
    public static int calculateSum(int[] array) {
        int sum = 0;
        // Iterate through each element in the array and add it to the sum
        for (int num : array) {
            sum += num;
        }
        return sum;

	}

}

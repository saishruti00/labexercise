package array;
import java.util.Arrays;
import java.util.HashSet;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Define an array of integers with duplicate values
        int[] numbers = {1, 2, 3, 2, 4, 5, 1, 6, 7, 5};

        // Call the method to remove duplicates
        int[] uniqueNumbers = removeDuplicates(numbers);

        // Print the result
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueNumbers));
    }

    /**
     * This method removes duplicate elements from the given integer array.
     *
     * @param array the integer array from which duplicates need to be removed
     * @return a new array with unique elements
     */
    public static int[] removeDuplicates(int[] array) {
        // Use a HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert the HashSet back to an array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;

	}

}

package day5;
import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Prompt user to enter a string
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        // Check if the string is a palindrome
		        boolean isPalindrome = checkPalindrome(input);

		        // Display the result
		        if (isPalindrome) {
		            System.out.println("The string is a palindrome.");
		        } else {
		            System.out.println("The string is not a palindrome.");
		        }
		    }

		    public static boolean checkPalindrome(String str) {
		        int left = 0;
		        int right = str.length() - 1;

		        while (left < right) {
		            // Compare characters from both ends
		            if (str.charAt(left) != str.charAt(right)) {
		                return false;
		            }
		            left++;
		            right--;
		        }
		        return true;
		    }
		}


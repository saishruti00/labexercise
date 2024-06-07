package day8;
import java.util.Scanner;
import java.time.Year;
public class VotingEligibility {
	 int birthYear;
	    int age;

	    // Constructor to initialize the birth year and calculate the age
	    public VotingEligibility(int birthYear) {
	        this.birthYear = birthYear;
	        this.age = calculateAge(birthYear);
	    }

	    // Method to calculate age based on the current year
	    private int calculateAge(int birthYear) {
	        int currentYear = Year.now().getValue();
	        return currentYear - birthYear;
	    }
	    public boolean isEligibleToVote() {
	        return age >= 18;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        VotingEligibility voter = new VotingEligibility(birthYear);

        System.out.println("Your age is: " + voter.age);

        if (voter.isEligibleToVote()) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();

	}

}

package day5;
import java.util.Scanner;
public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);

	      String isGraduated;
	      System.out.println("Are you a Graduate ? Yes/No");
	      isGraduated=sc.next();
	      if(isGraduated.equals("Yes"))
	      {
	      System.out.println("You are Eligible");
	      }
	}
}
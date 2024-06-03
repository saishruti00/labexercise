package day2;
import java.util.Scanner;
public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Taking input for byte
		        System.out.print("Enter a byte value: ");
		        byte byteValue = scanner.nextByte();

		        // Taking input for short
		        System.out.print("Enter a short value: ");
		        short shortValue = scanner.nextShort();

		        // Taking input for int
		        System.out.print("Enter an int value: ");
		        int intValue = scanner.nextInt();

		        // Taking input for long
		        System.out.print("Enter a long value: ");
		        long longValue = scanner.nextLong();

		        // Taking input for float
		        System.out.print("Enter a float value: ");
		        float floatValue = scanner.nextFloat();

		        // Taking input for double
		        System.out.print("Enter a double value: ");
		        double doubleValue = scanner.nextDouble();

		        // Taking input for char
		        System.out.print("Enter a char value: ");
		        char charValue = scanner.next().charAt(0);

		        // Taking input for boolean
		        System.out.print("Enter a boolean value: ");
		        boolean booleanValue = scanner.nextBoolean();

		        // Printing the values
		        System.out.println("You entered:");
		        System.out.println("byte: " + byteValue);
		        System.out.println("short: " + shortValue);
		        System.out.println("int: " + intValue);
		        System.out.println("long: " + longValue);
		        System.out.println("float: " + floatValue);
		        System.out.println("double: " + doubleValue);
		        System.out.println("char: " + charValue);
		        System.out.println("boolean: " + booleanValue);

		        // Closing the scanner
		        scanner.close();
	}

}

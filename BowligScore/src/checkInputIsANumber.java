
import java.util.Scanner;

public class checkInputIsANumber {

	private static Scanner input;

	public static void main(String[] args) {

		checkInputIsANumber ez = new checkInputIsANumber();
		
		checkInputIsIntiger(); // calling method
	//	System.out.println(checkInputIsIntiger.b);
		System.out.println(ez.checkInputIsIntiger());
		
	}

	public static int checkInputIsIntiger() {
		input = new Scanner(System.in);
		boolean isNumber;
		System.out.println("Enter int: ");
		do {
			if (input.hasNextInt()) {
				isNumber = true;
			} else {
				System.out.println(" give me a number.");
				isNumber = false;
				input.next();

			}
		} while (!(isNumber));

		System.out.println("Well Done!");
		int b = input.nextInt();
		// return input.nextInt();
		System.out.println("Hello you typed "+ b);
		return b;
	}

}

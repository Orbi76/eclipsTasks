import java.util.Scanner;

public class checkInputNumber {
	private static Scanner input;

	public static void main(String[] args) {

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
		} while (!(isNumber)); //execute till true

		System.out.println("Well Done!");

	}

}

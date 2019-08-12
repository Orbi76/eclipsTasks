import java.util.Scanner;

public class tobbSzamBeirasaTizig {

	private static Scanner beirt;

	public static void main(String[] args) {
		checkNumbNullTen();
		System.out.println("ide a checkNumbNullTen() return je" );
	}
	
	public static int checkNumbNullTen() {
		beirt = new Scanner(System.in);
		int beirtSzam;
		do {
			System.out.println("Please enter a positive number between 0-10");
			while (!beirt.hasNextInt()) {
				System.out.println("That's not a number!");
				beirt.next(); // this is important!
			}
			beirtSzam = beirt.nextInt();
			// } while (number >= 11 || number <= -1); // execute DO till true
		} while (!(beirtSzam >= 0 && beirtSzam <= 10)); // execute do till true
	//	System.out.println("Thank you! Got " + beirtSzam);
		return beirtSzam;
	}
	
}

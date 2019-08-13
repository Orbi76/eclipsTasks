import java.util.Arrays;

public class tobbSzamBeirasaTizig {

//	private static Scanner beirt;
	private static int[] rolls = new int[5];
	
	public static void main(String[] args) {
		
//		tobbSzamBeirasaTizig most = new tobbSzamBeirasaTizig();
		checkNumbNullTen most = new checkNumbNullTen();

// System.out.println("Please enter a positive number between 0-10 elso");
//		System.out.println("ide a checkNumbNullTen() return je" + tobbSzamBeirasaTizig.checkNumbNullTen());
	//	System.out.println("ide a checkNumbNullTen() return je" + most.checkNumbNullTen());
		for (int i = 0; i < 5; i++) {
		//	checkNumbNullTen();
//		rolls[i] = tobbSzamBeirasaTizig.checkNumbNullTen();
		int guritott = most.checkNumbNullTen();
			rolls[i] = guritott;
		
		System.out.println(Arrays.toString(rolls));	
			}
			
	}
/*	
	public static int checkNumbNullTen() {
		beirt = new Scanner(System.in);
		int beirtSzam;
		do {
		//	System.out.println("Please enter a positive number between 0-10");
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
*/	
	
}

import java.util.Arrays;
import java.util.Scanner;

public class playCard {

	static int elemSza = 21;
	static int[] rolls = new int[elemSza];

	public static void main(String[] args) {

		Game gam = new Game();
		checkNumbNullTen most = new checkNumbNullTen();

		for (int i = 0; i < elemSza; i++) {
			int beirtSzamok = most.checkNumbNullTen();
			gam.roll(beirtSzamok);
			rolls[i] = beirtSzamok;
			
			if (rolls[i] == 10) {
				System.out.println("Strike");
			
			 
			System.out.println("kiirt roll[i] " + rolls[i]);
		
			} else if(rolls[i]+ rolls[i+1]== 10) {
				System.out.println("Valami");
			} else
			gam.score();
			System.out.println("" + gam.score());
			System.out.println(Arrays.toString(rolls));
			System.out.println("ElemSzam" + elemSza);
			
			
		}
	} 
}

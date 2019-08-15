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
			if (i==0) {
			System.out.println("kiirt roll[i] " + rolls[i]);
			}
			else if (i==1) {
				System.out.println("kiirt roll[i] [" + rolls[i-1] + ";"+ rolls[i] + "]");
				
				}
			
			else if(i % 2 ==0) {
				System.out.println("kiirt roll 1 azaz paratlan [" + rolls[i] + ";0"+  "]");
		//	System.out.println("kiirt roll[i] " + rolls[i]);
			}
			
			else if(i % 2 ==1 || i==0) {
				System.out.println("kiirt roll[i] paros [" + rolls[i-1] + ";"+ rolls[i] + "]");
		//	System.out.println("kiirt roll[i] " + rolls[i]);
			}
			
			
			if (rolls[i] == 10) {
				System.out.println("Strike");
			
			 
			
		
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

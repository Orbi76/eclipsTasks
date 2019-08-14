import java.util.Arrays;
import java.util.Scanner;

public class playCard {
	


	
	static int elemSzam = 21;
	static int[] rolls = new int[elemSzam];

	public static void main(String[] args) {
		BowlingScore g = new BowlingScore();
		Game gam = new Game();
		 
		

			checkNumbNullTen most = new checkNumbNullTen();
			for (int i = 0; i < elemSzam; i++) {

				int beirtSzamok = most.checkNumbNullTen();
				rolls[i] = beirtSzamok;
				gam.roll(beirtSzamok);

				System.out.println(Arrays.toString(rolls));
			//	gam.score();
				
				System.out.println("" + gam.score());
				
			
			}

		
		
		
		
		
	//	System.out.println("result "+ g.score());	
		//System.out.println(g.rolls());
		System.out.println("Mennyit utottel le kezdodik a jatek?");
		Scanner beirtSzamok = new Scanner(System.in);
//		rolls[elemSzam] = beirtSzamok.nextInt();
		int roll = beirtSzamok.nextInt();
		System.out.println("" + roll);
		g.roll(roll);
		g.score();
		System.out.println("" + g.score());
//		int rolls[] = beirtSzamok.nextInt();
		System.out.println("Eddigi dobasok " + Arrays.toString(rolls));
		System.out.println("Score" + g.score());
		
//		int roll= 0;
	int[] szamLista = new int[elemSzam]; //	rolls
		
		
if(roll <= 10) {
		for (int i = 0; i < elemSzam; i++) {
			if (i == 0) {
				System.out.println("Enter the first roll's result: ");
				rolls[i] = beirtSzamok.nextInt();
				System.out.println(Arrays.toString(rolls));		
			} 
//			else if(isSpare(cursor))  {
//				System.out.println("Spare!");
//			} 
			
			
			else if (i == 20)  {
				System.out.println("Spare! One more throw");
			} 
	//		else if ( i == 19 || rolls[i] == 10) {
			else if (( i == 19) && (roll == 10)) {	
				System.out.println("Strike! Two more throw");
			} 
			else {
				System.out.println("Enter the "+ (i+1) +" roll's result: ");
//				rolls[i] = beirtSzamok.nextInt();
//				System.out.println(Arrays.toString(rolls));
			}
			
			rolls[i] = beirtSzamok.nextInt();
			System.out.println("Eddigi dobasok " + Arrays.toString(rolls));
			System.out.println("Score" + g.score());
	//		System.out.println("" + g.score(cursor));
		}
		beirtSzamok.close();
		
} else {
	System.out.println("has to be between 0 -10 ");
}
	}
}
	
	
	
	


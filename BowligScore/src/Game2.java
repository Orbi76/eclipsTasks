import java.util.Arrays;
import java.util.Scanner;

public class Game2 {

	private int pinsDown = 5;
	private static int roll = 0;
	private static int[] rolls = new int[21];

	public void roll(int... rolls) {
		for (int pinsDown : rolls)
			roll(pinsDown);

	}

	// public void roll(int pinsDown) {
	// rolls[roll++] = pinsDown;
	// }
	public void roll(int beirtSzamok) {
		rolls[roll++] = beirtSzamok;
	}

	public int score() {
		int score = 0;
		int cursor = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (isStrike(cursor)) {
				score += 10 + rolls[cursor + 1] + rolls[cursor + 2];
				cursor++;
				// System.out.println("Strike!");
			} else if (isSpare(cursor)) {
				score += 10 + rolls[cursor + 2];
				cursor += 2;
				// System.out.println("Spare!");
			} else {
				score += rolls[cursor] + rolls[cursor + 1];
				cursor += 2;
			}
			// 1 System.out.println("Frame: " + frame);
		}
		// System.out.println("Cursor" + cursor);

		return score;
	}

	private boolean isStrike(int cursor) {
		return rolls[cursor] == 10;
	}

	private boolean isSpare(int cursor) {
		return rolls[cursor] + rolls[cursor + 1] == 10;
	}

	public static void main(String[] args) {
		Game g = new Game();

		
		System.out.println("result "+ g.score());	
//	System.out.println(g.rolls());
		

		int elemSzam = 21;
//	rolls	int[] szamLista = new int[elemSzam];
		Scanner beirtSzamok = new Scanner(System.in);
//		rolls[] = beirtSzamok.nextInt();
if(beirtSzamok.nextInt() <= 10) {
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
		//	System.out.println("" + g.score(cursor));
		}
		beirtSzamok.close();
		
} else {
	System.out.println("has to be between 0 -10 ");
}
		
	}

}

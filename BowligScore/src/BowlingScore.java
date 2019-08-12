import java.util.*;

public class BowlingScore 
{
	private static int roll = 0;
	private static int[] rolls = new int[21];

//	
/*
	
	public static void main(String[] args)  {
		BowlingScore bs = new BowlingScore();
		Scanner input = new Scanner(System.in);
		System.out.println("What was the score? ");  
		
			  roll [i] = input.nextInt();
	//	int b = 5;
		 int[] roll  = new int[rolls];
		  for (int i=0; i< rolls; i++) {
		      
			//  displayRolls();
		//	  score();
			  }
		  
		//System.out.println("Your score is :  "+(Arrays.toString(roll))+"\n");
		System.out.println("Score " );
		// displayRolls();
		printFrameScore(roll);
	} 
*/	
//------	
	public static void main(String[] args) {

 //       Scanner read = new Scanner(System.in);
 //       System.out.println("How many inputs?");
 //       int inp = read.nextInt();
  //    Print(rolls);
   //   printFrameScore(rolls);
 //     displayRolls(rolls);
		//roll();
    }

	
	    private static int[] ReadInput(int questionsNo, Scanner sc) {
        int[] inputs = new int[questionsNo];

        for (int i = 1; i < questionsNo; i++) {
            System.out.print("What was " + i + ". input? ");
            int readInt = sc.nextInt();
            inputs[i] = readInt;
        }
        sc.close();
        return inputs;
    }
/*
    private static void Print(int[] inputs) {
        System.out.println("Print results: ");
        for (int i = 0; i < inputs.length; i++) {
            System.out.println( i + ")" + " " + inputs[i]);
        }
    }
*/    
    private static void printFrameScore(int[] frame) {
    	System.out.println("Print result FrameScore: ");
        for (int i = 1; i < frame.length; i++) {
            System.out.println(i + ": " + frame[i]);
        }
    }
    
    
/*
    private static void displayRolls(int[] inputs) {
        for (int i = 0; i < rolls.length; i++) {
            System.out.print(rolls[i] + ", ");
        }
    }
*/	
//-----	
//	
	
/*	public void roll(int...rolls) {
		for (int pinsDown : rolls) 
			roll(pinsDown);
	}
	*/
	
	
	public static void roll(int pinsDown) {
		rolls[roll++] = pinsDown;
	}
	
	public static int score() {
		int score = 0;
		int cursor = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (isStrike(cursor)) {
				score += 10 + rolls[cursor+1] + rolls[cursor+2];
				cursor++;
			} else if(isSpare(cursor)) {
				score += 10 + rolls[cursor+2];
				cursor += 2;
			} else {
				score += rolls[cursor] = rolls[cursor+1];
				cursor += 2;
			}
		}
		return score;
	}
	
	private static boolean isStrike(int cursor) {
		return rolls[cursor] == 10;
	}
	
	private static boolean isSpare(int cursor) {
		return rolls[cursor] + rolls[cursor+1] == 10;
	}
/*
	//Print scores for each frame   
    public static void printFrameScore(int[] frame) {
    	System.out.println("Print result FrameScore: ");
        for (int i = 1; i < frame.length; i++) {
            System.out.println(i + ": " + frame[i]);
        }
    }
    
    

    public static void displayRolls() {
        for (int i = 0; i < rolls.length; i++) {
            System.out.print(rolls[i] + ", ");
        }
    }
   */ 
    
	
}

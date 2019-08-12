import java.util.Scanner;

public class ju {
//	 private static int number;

	public static void main(String args[]) {
		 Scanner szam = new Scanner(System.in);
		 int number;
	      int x = 10;
	  //    int y = 0;	

	      do {
	         System.out.print("value of x : " + x );
	         x++;
	         System.out.print("\n");
	         int y = szam.nextInt();
	         System.out.println(y);
	         while (!szam.hasNextInt()) {
	 	        System.out.println("That's not a number!");
	 	        szam.next(); // this is important!
	 	    }
	          number = szam.nextInt();
	      }while (number >= 11 || number <= -1);
	
		System.out.println("Thank you! Got " + szam);
		
		
		
		
		
		
		
		
		
	   }
}

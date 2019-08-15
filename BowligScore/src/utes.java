import java.util.Arrays;
import java.util.Scanner;

public class utes {

	public static void main(String[] args) {

		int b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter int: ");
		b = input.nextInt();

		System.out.println(b);

		int elemSzam = 4;
		int[] szamLista = new int[elemSzam];
		Scanner beirtSzamok = new Scanner(System.in);


		
		
		for (int i = 0; i < elemSzam; i++) {
			if (i == 0) {
				System.out.println("Enter the first roll's result: ");
				szamLista[i] = beirtSzamok.nextInt();
				System.out.println(Arrays.toString(szamLista));
			} else {
				System.out.println("Enter the "+ (i+1) +" roll's result: ");

				szamLista[i] = beirtSzamok.nextInt();
				System.out.println(Arrays.toString(szamLista));

			}

		}
		beirtSzamok.close(); 
		input.close();
	}

}

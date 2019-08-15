import java.util.Arrays;

public class tobbSzamBeirasaTizig {

	private static int[] rolls = new int[5];

	public static void main(String[] args) {

		checkNumbNullTen most = new checkNumbNullTen();
		for (int i = 0; i < 5; i++) {

			int guritott = most.checkNumbNullTen();
			rolls[i] = guritott;

			System.out.println(Arrays.toString(rolls));
		}

	} 

} 

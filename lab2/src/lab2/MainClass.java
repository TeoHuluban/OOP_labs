package lab2;

import java.math.BigInteger;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputValue = input.nextInt();
		
		System.out.println("Valoarea este " + inputValue);
		
		int maxInt = Integer.MAX_VALUE;
		System.out.println(maxInt + 1);
		
		int minInt = Integer.MIN_VALUE;
		System.out.println(minInt - 1);
		
		float maxFloat = Float.MAX_VALUE;
		System.out.println(maxFloat * 3);
		
		try {
			System.out.println(maxInt / 0);
		}
		catch(AritmeticException exception) {
			System.out.println("Valoare gresita");
			inputValue = input.nextInt();
		}
		System.out.println("Noua valoare" + inputValue);
		}

//		BigInteger sum, i;
//		for (i = 1; i < 64; i++)
//			sum = sum + pow(i - 1);
//		System.out.println(sum);
	}

}

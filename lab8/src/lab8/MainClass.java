package lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		do 
//		{
//			try 
//			{
//				int pin = input.nextInt();
//				break;
//			}
//			catch(InputMismatchException e)
//			{
//				System.out.println("Caractere invalide");
//				input.next();  //eliberam buffer
//			}
//			
//			finally {}
//		} while (true);
		
		
		BancAccount b = new BancAccount();
		b.sold = 34;
		try {
		b.retragereNumerar(100);}
		catch (FondInsuficientException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

package lab4;

import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		
		Sofer sofer = new Sofer("Ion", 42);
		Autovehicul auto = new Autovehicul("Tesla", Color.black, 250, 40, 1, 5, sofer);
		System.out.println(auto.toString());
		
		auto.accelerare(40);
		System.out.println(auto.toString());
		
		auto.decelerare(20);
		System.out.println(auto.toString());
		
		auto.oprire();
		System.out.println(auto.toString());
		
		auto.accelerare(40);
		System.out.println(auto.toString());
		
		auto.decelerare(100);
		System.out.println(auto.toString());
		
		auto.accelerare(300);
		System.out.println(auto.toString());
		
	}

}

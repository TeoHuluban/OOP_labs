
public class MainClass {

	public static void main(String[] args) {
		Furnizor fur1 = new Furnizor("ABC", "dlsjjk", 4367);
		Furnizor fur2 = new Furnizor("EFG", "jskhdb", 1435);
		Inventar inv = new Inventar(10);
		Produs pr1 = new Produs("Sfg", fur1, 34, 45);
		Produs pr2 = new Produs("Dgfh", fur1, 10, 23);
		Produs pr3 = new Produs("Hdjdj", fur2, 67, 10);
		Produs pr4 = new Produs("Sjfjf", fur1, 87, 1);
		Produs pr5 = new Produs("Jsjs", fur2, 56, 38);
		
		inv.adaugaProdus(pr1);
		inv.adaugaProdus(pr2);
		inv.adaugaProdus(pr3);
		inv.adaugaProdus(pr4);
		inv.adaugaProdus(pr5);
		
		inv.listeazaProduse();
		System.out.println("Produsul cautat:\n" + inv.gasesteProdusDupaNume("Sfg"));
		System.out.println(inv.gasesteProdusDupaNume("jhdbfjh")); //nu exista
	}

}

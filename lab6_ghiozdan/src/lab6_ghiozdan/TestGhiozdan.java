package lab6_ghiozdan;

public class TestGhiozdan {

	public static void main(String[] args) {
		Ghiozdan ghiozdan = new Ghiozdan(10);
		Caiet c1 = new Caiet("caiet1");
		Caiet c2 = new Caiet("caiet2");
		Caiet c3 = new Caiet("caiet3");
		Manual m1 = new Manual("manual1");
		Manual m2 = new Manual("manual2");
		
		ghiozdan.add(c1);
		ghiozdan.add(m2);
		ghiozdan.add(c2);
		ghiozdan.add(m1);
		ghiozdan.add(c3);
		
		ghiozdan.getNrRechizite();
		ghiozdan.getNrCaiete();
		ghiozdan.getNrManuale();
		System.out.println("\n");
		
		ghiozdan.listItems();
		System.out.println("\n");
		ghiozdan.listCaiet();
		System.out.println("\n");
		ghiozdan.listManual();
		
	}

}

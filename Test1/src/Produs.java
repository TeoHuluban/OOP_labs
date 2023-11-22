
public class Produs {
	private String nume;
	private Furnizor furnizor;
	private int pret;
	private int cantitateInStoc;
	
	//constructori
	public Produs()
	{
		this.nume = "-";
		this.furnizor = new Furnizor();
		this.pret = 0;
		this.cantitateInStoc = 0;
	}
	
	public Produs(String nume, Furnizor furnizor, int pret, int cantitateInStoc)
	{
		this.nume = nume;
		this.furnizor = furnizor;
		this.pret = pret;
		this.cantitateInStoc = cantitateInStoc;
	}
	
	//setter/getter
	//nume
	public String getNume()
	{
		return this.nume;
	}
	
	//furnizor
	public void setFurnizor(Furnizor furnizor)
	{
		this.furnizor = furnizor;
	}

	public Furnizor getFurnizor()
	{
		return this.furnizor;
	}
	
	//pret
	public int getPret()
	{
		return this.pret;
	}
	
	//cantitate
	public void setCantitateInStoc(int  cantitateInStoc)
	{
		this.cantitateInStoc = cantitateInStoc;
	}
	
	public int getCantitateInStoc()
	{
		return this.cantitateInStoc;
	}
	
	@Override
	public String toString()
	{
		return "Nume:" + nume + "\n" + 
				"Furnizor:" + furnizor + "\n" +
				"Pret:" + pret + "\n" +
				"Cantitate In Stoc:" + cantitateInStoc + "\n";
	}
}

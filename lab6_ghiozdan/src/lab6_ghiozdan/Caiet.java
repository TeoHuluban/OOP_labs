package lab6_ghiozdan;

public class Caiet extends rechizita{
	
	public Caiet(String nume)
	{
		eticheta = nume;
	}
	
	public String getNume()
	{
		return "Caiet" + eticheta;
	}
}

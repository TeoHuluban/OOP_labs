package lab4;

public class Sofer {
	private String nume;
	private int varsta;
	
	public Sofer(String nume, int varsta)
	{
		this.nume = nume;
		this.varsta = varsta;
	}
	
	public String getNume()
	{
		return nume;
	}
	
	public void setNume(String nume)
	{
		this.nume = nume;
	}
	
	public int getVarsta()
	{
		return varsta;
	}
	
	public void setVarsta(int varsta)
	{
		this.varsta = varsta;
	}
}

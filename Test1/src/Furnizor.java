
public class Furnizor {
	private String numeSRL;
	private String infoFiscal;
	private int bilant;
	
	//constructori
	public Furnizor()
	{
		this.numeSRL = "-";
		this.infoFiscal = "-";
		this.bilant = 0;
	}
	
	public Furnizor(String numeSRL, String infoFiscal, int bilant)
	{
		this.numeSRL = numeSRL;
		this.infoFiscal = infoFiscal;
		this.bilant = bilant;
	}
	
	//setter/getter
	//nume
	public void setNumeSRL(String numeSRL)
	{
		this.numeSRL = numeSRL;
	}
	
	public String getNumeSRL()
	{
		return this.numeSRL;
	}
	
	//infoF
	public void setinfoFiscal(String infoFiscal)
	{
		this.numeSRL = infoFiscal;
	}
	
	public String getinfoFiscal()
	{
		return this.infoFiscal;
	}
	
	//bilant
	public void setBilant(int bilant)
	{
		this.bilant = bilant;
	}
	
	public int getBilant()
	{
		return this.bilant;
	}
	
	@Override
	public String toString()
	{
		return "\nNume SRL:" + numeSRL + "\n" + 
				"Info Fiscal:" + infoFiscal + "\n" +
				"Bilant:" + bilant;
	}
}

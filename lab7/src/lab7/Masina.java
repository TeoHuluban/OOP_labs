package lab7;

public class Masina implements Cloneable, Comparable{
	String marca;
	String culoare;
	int id;
	
	public Masina(String m, int i, String c)
	{
		marca=m;
		culoare=c;
		id=i;
	}
	
	public void setCuloare(String c)
	{
		culoare=c;
	}
	
	public Masina clone()
	{
		try {
		return (Masina)super.clone();}
		catch (Exception e) {
			System.out.println("NOT CLONEABLE");
			return null;
		}
	}

	@Override
	public int compareTo(Object o) {
		Masina temp = (Masina) o;
		
		//if(id < temp.id)
		//	return -1;
		//else if (id == temp.id)
		//	return 0;
		//else
		//	return 1;
		
		//   sau:
		
		return (id - temp.id);
	}
}

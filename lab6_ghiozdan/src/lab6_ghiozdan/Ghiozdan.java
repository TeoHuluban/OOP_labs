package lab6_ghiozdan;

public class Ghiozdan {
	rechizita[] rec;
	int dim = 0;
	
	public Ghiozdan(int size)
	{
		rec = new rechizita[size];
	}
	
	void add(Manual manual)
	{
		rec[dim++] = manual;
	}
	
	void add(Caiet manual)
	{
		rec[dim++] = manual;
	}
	
	void listItems()
	{
		for(int i=0;i<dim;i++)
			System.out.println(rec[i].getNume());
	}
	
	void listManual()
	{
		for(int i=0;i<dim;i++)
			if(rec[i] instanceof Manual)
				System.out.println(rec[i].getNume());
	}
	
	void listCaiet()
	{
		for(int i=0;i<dim;i++)
			if(rec[i] instanceof Caiet)
				System.out.println(rec[i].getNume());
	}
	
	void getNrRechizite()
	{
		System.out.println(dim);
	}
	
	void getNrManuale()
	{
		int k=0;
		for(int i=0;i<dim;i++)
			if(rec[i] instanceof Manual)
				k++;
		System.out.println(k);
	}
	
	void getNrCaiete()
	{
		int k=0;
		for(int i=0;i<dim;i++)
			if(rec[i] instanceof Caiet)
				k++;
		System.out.println(k);
	}
}

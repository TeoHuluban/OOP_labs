
public class Inventar {
	private Produs[] lista;
	private int nrProduse;
	
	public Inventar(int dim)
	{
		lista = new Produs[dim];
		nrProduse = -1;
	}
	
	public void adaugaProdus(Produs produs)
	{
		int ok=1;
		for(int i=0; i<nrProduse; i++)
		{
			if(lista[i] != null && produs.getNume().equals(lista[i].getNume()))
					ok = 0;
		}
		
		if(ok == 0)
			System.out.println("Produs deja existent");
		else if(produs.getCantitateInStoc() == 0)
			System.out.println("Cantitate 0");
		else lista[++nrProduse] = produs;
	}
	
	public void listeazaProduse()
	{
		for(int i=0; i<nrProduse; i++)
			System.out.println(lista[i] + " ");
		System.out.println("\n");
	}
	
	public Produs gasesteProdusDupaNume(String nume)
	{
		for(int i=0; i<nrProduse; i++)
			if(lista[i] != null && lista[i].getNume().equals(nume))
					return lista[i];
		System.out.println("Produsul nu exista");
		return null;
	}
}

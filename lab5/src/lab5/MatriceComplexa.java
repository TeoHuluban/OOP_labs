package lab5;

public class MatriceComplexa {
	NumarComplex[][] matrice;
	
	MatriceComplexa(int rows, int cols)
	{
		matrice = new NumarComplex[rows][cols];
	}
	
	public MatriceComplexa adunare(MatriceComplexa b)
	{
		MatriceComplexa rezultat = new MatriceComplexa(this.matrice.length, this.matrice[0].length);
		for(int i=0; i<this.matrice.length; i++)
			for(int j=0; j<this.matrice[0].length; j++)
				rezultat.matrice[i][j] = this.matrice[i][j].adunare(b.matrice[i][j]);
		return rezultat;
	}
	
	public MatriceComplexa scadere(MatriceComplexa b)
	{
		MatriceComplexa rezultat = new MatriceComplexa(this.matrice.length, this.matrice[0].length);
		for(int i=0; i<this.matrice.length; i++)
			for(int j=0; j<this.matrice[0].length; j++)
				rezultat.matrice[i][j] = this.matrice[i][j].scadere(b.matrice[i][j]);
		return rezultat;
	}
	
	public MatriceComplexa inmultire(MatriceComplexa b)
	{
		MatriceComplexa rezultat = new MatriceComplexa(this.matrice.length, this.matrice[0].length);
		for(int i=0; i<this.matrice.length; i++)
			for(int j=0; j<this.matrice[0].length; j++)
				for(int k=0; k<this.matrice.length; k++)
					rezultat.matrice[i][j] = rezultat.matrice[i][j].adunare(this.matrice[i][j+k].inmultire(b.matrice[i][j+k]))
		return rezultat;
	}
}

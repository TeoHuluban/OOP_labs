package lab5;

public class NumarComplex {
	private int parteRe;
	private int parteIm;
	
	public NumarComplex(int parteRe, int parteIm)
	{
		this.parteRe = parteRe;
		this.parteIm = parteIm;
	}
	
	public NumarComplex adunare(NumarComplex b)
	{
		NumarComplex rezultat = new NumarComplex(0, 0);
		rezultat.parteRe = b.parteRe + parteRe;
		rezultat.parteIm = b.parteIm + parteIm;
		return rezultat;
	}
	
	public NumarComplex scadere(NumarComplex b)
	{
		return new NumarComplex(parteRe - b.parteRe, parteIm - b.parteIm);
	}
	
	public NumarComplex inmultire(NumarComplex b)
	{
		return new NumarComplex(parteRe * b.parteRe + - parteIm * b.parteIm, 
				parteRe * b.parteIm + parteIm * b.parteRe);
	}
	
	@Override
	public String toString()
	{
		return parteRe + "+" + parteIm + "xi";
	}
}

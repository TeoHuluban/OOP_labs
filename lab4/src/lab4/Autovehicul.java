package lab4;

import java.awt.Color;

public class Autovehicul {
	//Atribute:
	private String marca;
	private Color culoare;
	private float vitezaMax;
	private float vitezaCurenta;
	private int treaptaVit;
	private int nrTrepteVit;
	private Sofer sofer;
	
	//Constructor:
	public Autovehicul(String marca, Color culoare, float vitezaMax, float vitezaCurenta, int treaptaVit, int nrTrepteVit, Sofer sofer)
	{
		this.marca = marca;
		this.culoare = culoare;
		this.vitezaMax = vitezaMax;
		this.vitezaCurenta = vitezaCurenta;
		this.treaptaVit = treaptaVit;
		this.nrTrepteVit = nrTrepteVit;
		this.sofer = sofer;
	}
	
	//Metode:
	//Set/Get
	public String getMarca()
	{
		return marca;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public Color getCuloare()
	{
		return culoare;
	}
	
	public void setCuloare(Color culoare)
	{
		this.culoare = culoare;
	}
	
	public float getVitezaCurenta()
	{
		return vitezaCurenta;
	}
	
	public void setVitezaCurenta(float vitezaCurenta)
	{
		this.vitezaCurenta = vitezaCurenta;
	}
	
	public int getNrTrepteVit()
	{
		return nrTrepteVit;
	}
	
	public void setVitezaCurenta(int nrTrepteVit)
	{
		this.nrTrepteVit = nrTrepteVit;
	}
	
	public Sofer getSofer()
	{
		return sofer;
	}
	
	public void setSofer(Sofer sofer)
	{
		this.sofer = sofer;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void accelerare(float delta)
	{
		vitezaCurenta += delta;
		if (vitezaCurenta > vitezaMax)
			vitezaCurenta = vitezaMax;
		
		if (vitezaCurenta <= 20)
			treaptaVit = 1;
		if (vitezaCurenta > 20 && vitezaCurenta <= 40)
			treaptaVit = 2;
		if (vitezaCurenta > 40 && vitezaCurenta <= 80)
			treaptaVit = 3;
		if (vitezaCurenta > 80 && vitezaCurenta <= 120)
			treaptaVit = 4;	
		if (vitezaCurenta > 120)
			treaptaVit = 5;
	}
	
	public void decelerare(float delta)
	{
		vitezaCurenta -= delta;
		if (vitezaCurenta < 0)
			vitezaCurenta = 0;
		
		if (vitezaCurenta <= 20)
			treaptaVit = 1;
		if (vitezaCurenta > 20 && vitezaCurenta <= 40)
			treaptaVit = 2;
		if (vitezaCurenta > 40 && vitezaCurenta <= 80)
			treaptaVit = 3;
		if (vitezaCurenta > 80 && vitezaCurenta <= 120)
			treaptaVit = 4;	
		if (vitezaCurenta > 120)
			treaptaVit = 5;
	}
	
	public void setTreaptaVit(int treaptaVit)
	{
		this.treaptaVit = treaptaVit;
	}
	
	public void oprire()
	{
		vitezaCurenta = 0;
	}
	
	//Override
	public String toString()
	{
		return "Marca: " + marca +
				"\nCuloare: " + culoare +
				"\nViteza curenta: " + vitezaCurenta +
				"\nTreapta de viteza: " + treaptaVit +
				"\nSofer: " + sofer.getNume();
	}
	
}

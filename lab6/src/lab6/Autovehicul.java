package lab6;

public class Autovehicul {
	Sofer sofer;
	double vitezaMaxima;
	double vitezaCurenta;
	
	public Autovehicul(Sofer sofer)
	{
		this.sofer = sofer;
	}
	
	void accelereaza(int delta)
	{
		vitezaCurenta += delta;
	}
	
	void accelereaza(double delta)
	{
		vitezaCurenta += delta;
	}
}

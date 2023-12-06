package lab8;

public class BancAccount {
	int sold;
	
	void retragereNumerar(int sum) throws FondInsuficientException
	{
		if(sum > sold)
			throw new FondInsuficientException("Fond insuficient");
	}
}

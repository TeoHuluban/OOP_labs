package lab7;

public class Student implements Cloneable {
	String nume;
	int id;
	Masina masina;
	
	public Student(String nume, int id, Masina masina)
	{
		this.nume=nume;
		this.id=id;
		this.masina=masina;
	}
	
	public Student clone()
	{
		Student copieStudent;
		try {
		copieStudent = (Student)super.clone();}
		catch (Exception e) {
			System.out.println("NOT CLONEABLE");
			return null;
		}
		copieStudent.masina = masina.clone();
		//copieStudent.masina=new Masina(masina.marca, masina.culoare);
		return copieStudent;
	}
}

package lab7;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		Masina dacia=new Masina("Logan", 2, "Gri");
		Student s=new Student("Marcel", 1, dacia);
		Student s1=s.clone();
		s1.masina.setCuloare("verde");
		
		System.out.println(s.nume);
		System.out.println(s.id);
		System.out.println(s.masina.marca);
		System.out.println(s.masina.culoare);
		
		System.out.println(s1.nume);
		System.out.println(s1.id);
		System.out.println(s1.masina.marca);
		System.out.println(s1.masina.culoare);
		
		Masina m1=new Masina("dacia", 4, "sdf");
		Masina m2=new Masina("audi", 2, "dfg");
		Masina m3=new Masina("ford", 7, "fbv");
		
		Masina[] arr=new Masina[3];
		arr[0]=m1;
		arr[1]=m2;
		arr[2]=m3;
		
		Arrays.sort(arr);
		
		for(int i=0;i<3;i++)
			System.out.println(arr[i].marca);
	}

}

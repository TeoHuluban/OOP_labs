package lab5;

public class MainClass {

	public static void main(String[] args) {
		NumarComplex a = new NumarComplex(2, 4);
		NumarComplex b = new NumarComplex(5, 3);
		
		//System.out.println(a.adunare(b));
		//System.out.println(a.scadere(b));
		//System.out.println(a.inmultire(b));
		
		int[] arr = new int[] {1, 2, 3};
		int[] arr2 = arr;
		arr2[1] = 5;
		System.out.println(arr[1]);
		
		for (int element: arr)
			System.out.println(element);
		
		//arr2 = System.arrayCopy(arr); //deep copy
		
		int i=0;
		int j=arr.length - 1;
		while(i<j)
		{
			int aux = arr[i];
			arr[i] = arr[j];
			arr[j] = aux;
			i++;
			j--;
		}
		
		for (int element: arr)
			System.out.println(element);
		
		int[][] matrice = new int[3][3];
		int rows = matrice.length;
		int cols = matrice[0].length;
	}

}

package lab9;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		List<String> cars = new ArrayList<String>();
		
		cars.add("Dacia");
		cars.add("Renault");
		cars.add("Toyota");
		
		for(String i: cars)
		{
			if(i.equals("Dacia"))
				i="Logan";
		}
		
		System.out.println(cars);
		
		for(int i=0;i<3;i++)
		{
			if(cars.get(i).equals("Dacia"))
				cars.set(i, "Logan");
		}
		
		System.out.println(cars);
		
		ListIterator<String> carsIt=cars.listIterator();
		while(carsIt.hasNext())
		{
			if(carsIt.equals("Dacia"))
				carsIt.set("Logan");
			carsIt.next();
		}
		
		System.out.println(cars);
		
		
		Map<String, String> carteTelefonica = new HashMap<String, String>();
		carteTelefonica.put("Ana", "234-542");
		carteTelefonica.put("Ana", "178-926");
		
		String[] chat = {"Buna", "Buna", "ce", "mai", "faci"};
		Map<String, Integer> chatMap = new TreeMap<String, Integer>();
		for(int i=0;i<5;i++)
		{
			if(chatMap.containsKey(chat[i]))
			{
				chatMap.put(chat[i], chatMap.get(chat[i]) + 1);
			}
			else
				chatMap.put(chat[i], 1);
		}
		
		for(Map.Entry<String, Integer> entry: chatMap.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}

}

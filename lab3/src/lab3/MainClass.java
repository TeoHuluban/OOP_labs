package lab3;

public class MainClass {
	public static int prim(int x)
	{
		int nr=0;
		for(int i=2; i<=x/2; i++)
		{
			if(x%i==0) nr++;
		}
		if (nr==0) return 1;
		else return 0;
	}
	public static void main(String[] args) {
//		System.out.println(((0.1+0.1+0.1) - 0.3) < 0.00000000001);
//		
//		String str1 = "Ana are ";
//		String str2 = "mere";
//		String str3 = str1 + str2;
//		System.out.println(str3 == "Ana are mere");
//		System.out.println(str3.equals("Ana are mere"));
//		
//		int age = 18;
		
		//4.2
		int varsta=34, sex=0, inaltime=174;
		short wrap;
		
		wrap = (short)(inaltime);
		wrap = (short)(wrap | (sex<<8));
		wrap = (short)(wrap | (varsta<<9));
		
		inaltime = wrap & 0xff;
		sex = (wrap>>8) & 1;
		varsta = (wrap>>9) & 127;
		
		System.out.println(varsta);
		System.out.println(sex);
		System.out.println(inaltime);
		
		//4.4
		String str1 = "asdf";
		String str2 = "fdsa";
		String str3 = str1 + str2;
		System.out.println(str3 == "asdffdsa");
		System.out.println(str3.equals("asdffdsa"));
		
		//4.1
		int m=5, n=20;
		if(m % 2 != 0)
			m++;
		if(n % 2 != 0)
			n--;
		
	et:	for(int i = m; i <= n; i+=2)
		{
			for(int j=2; j <= i/2; j++)
			{
				if(prim(j)==1 && prim(i-j)==1)
					{System.out.println(i + "=" + j + "+" + (i-j));
					continue et;}
			}
		}
	
		//4.3
		String s="akjfkd";
		int v=0, c=0;
		for(int i=0;i<s.length(); i++)
			{switch (s.charAt(i)){
			case 'a': v++;
			break;
			case 'e': v++;
			break;
			case 'i': v++;
			break;
			case 'o': v++;
			break;
			case 'u': v++;
			}
			}
		
		c=s.length()-v;
		System.out.println("vocale:"+v);
		System.out.println("consoane:"+c);
		
	}
}

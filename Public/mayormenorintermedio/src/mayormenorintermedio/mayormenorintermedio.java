package mayormenorintermedio;

public class mayormenorintermedio {
	static int  A=10 , B=5 , C=15;
	public static void main (String  t[]) {
	if (A>B)
		if (A>C)
			if(B>C)
				System.out.println(" "+A+" "+B+" "+C);
			else 
				System.out.println(" "+A+" "+C+" "+B);
		else 
			System.out.println(" "+C+" "+A+" "+B);
	else if (B>C)
		if (A>C)
			System.out.println(" "+B+" "+A+" "+C);
		else 
	System.out.println(" "+B+" "+C+" "+A);
	else
		System.out.println(" "+C+" "+B+" "+A);
	}
	
		 
	
	
	
}

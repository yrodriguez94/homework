
public class condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double A=4,B=16,C=20;
        if (A>B)
        	 if (A>C)
        		 if (B>C)
        			 System.out.println(""+A+B+C);
        		 else
        			 System.out.println(""+A+C+B);
        	 		else
        	 			 System.out.println(""+C+A+B);
        else
        if (B>C)
        	if (A>C)
        		   System.out.println(""+B+A+C);
        			else
        				 System.out.println(""+B+C+A);
        				else
        					 System.out.println(""+C+B+A);
        
        if (A%2==0)
        	 System.out.println(A+"es par");
        else
        	 System.out.println(A+"es impar");
        
        		if (B%2==0)
        			System.out.println(B+"es par");
        		else
        			System.out.println(B+"es impar");
        
        			if (C%2==0)
        				System.out.println(C+"es par");
        				else
        					System.out.println(C+"es impar");
       if (Math.sqrt(A) * Math.sqrt(A) == A)	
    		    System.out.println("es exacta");
       			if(Math.sqrt(A) * Math.sqrt(A) != A)
       				System.out.println("no es exacta");
       			if (Math.sqrt(B) * Math.sqrt(B) == B)	
        		    System.out.println("es exacta");
           			if(Math.sqrt(B) * Math.sqrt(B) != B)
           				System.out.println("no es exacta");
           			if (Math.sqrt(C) * Math.sqrt(C) == C)	
            		    System.out.println("es exacta");
           					if(Math.sqrt(C) * Math.sqrt(C) != C)
           						System.out.println("no es exacta");
       		
        		
        		
	}

}

package clase;

import java.util.Scanner;

public class taller {
	public static void main (String a[]){
		Scanner X=new Scanner (System.in);
		int r= X.nextInt();
		int b= X.nextInt();
		int c= X.nextInt();
		int s= (r+b);
		System.out.println("el valor digitado de A es: "+r);
		System.out.println("el valor digitado de B es: "+b);
		System.out.println("el valor digitado de C es: "+c);
		System.out.println("la suma de A y B es: "+s);
		 s = r;
	        r = b;
	        b = s; 
	        c = c;
	        System.out.println("Valores intercambiados: A = " + r + "   B = " + b);
	        if (r>b)
	        System.out.println("la operacion de elevar el numero mayor por el menor es :"+" "+Math.pow(r,b));
	        if (b>r)
	        	System.out.println("la operacion de elevar el numero mayor por el menor es :"+" "+Math.pow(b,r));
	        if (r%3==0){
	        	System.out.println("El numero "+r+",es multiplo de 3");}
	        	else 
	        		System.out.println("El numero "+r+", no es multiplo de 3");
	        	if (b%3==0){
		        	System.out.println("El numero "+b+",es multiplo de 3");}
		        	else
		        		System.out.println("El numero "+b+", no es multiplo de 3");
		        		if (c%3==0)
				        	System.out.println("El numero "+c+",es multiplo de 3");
				        	else
				        		System.out.println("El numero "+c+", no es multiplo de 3");
		        	double interno, x1, x2, rCompleja;
		        	interno = b * b -(4 * r * c);
		        	if (interno ==0){
		        		x1= -b / (2 * r);
		        		System.out.println("Existe una raiz doble de valor "+x1);
		        	}else if (interno > 0 ) {
		        		interno= Math.sqrt(interno);
		        		x1 = (-b + interno) / (2 * r );
		        		x2 = (-b - interno) / (2 * r );
		        		System.out.println("las raices son " + x1 + " " + x2);
		        	}else{
		        		x1 = -b / (2 * r);
		        		rCompleja = Math.sqrt((-interno/ (2 * r)));
		        		System.out.println("Las raices son imaginarias " + x1);
		        		
		        		
		        		
		        		
		        		
		        		
		        		
		        	}
		        	
	        	
	        
	        
	        
	      
	        
	
		
	

	}

}

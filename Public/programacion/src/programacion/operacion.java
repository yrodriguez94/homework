package programacion;

public class operacion {
	int x,y;
	public static void
	main (String m[]){
		operacion t=new operacion();
		t.x=7;
		t.y=8;
		t.Suma();
		t.resta();
		t.multiplicacion();
		t.division();
		
	}
	public void Suma(){
		int r;
		r=x+y;
		System.out.println("la suma es"+r); 
	}
	public void resta(){
		int v;
		v=x-y;
		System.out.println("la resta es"+v);
	}
	public void multiplicacion(){
		int m;
		m=x*y;
		System.out.println("la multiplicacion es"+m);
	}
	public void division(){
		int d;
		d=x/y;
		System.out.println("la division es"+d);
	}
}

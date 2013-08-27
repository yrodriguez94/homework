package clase;
import java.util.Scanner;

public class CalculoSalario {

    
    Scanner entrada = new Scanner(System.in);
     double valordia, festivosiva;
     int numerodias;
    
    public static void main(String[] args) {
        System.out.print("Favor ingresar numero de horas trabajadas: ");
        numerodias = entrada.nextInt(); 
        System.out.print("Favor ingresar valor hora: ");
        valordia = entrada.nextDouble(); 
        System.out.print("Favor ingresar Ret en terminos porcentuales: ");
        festivosiva = entrada.nextDouble();
        Salario a = new Salario(numerodias, valordia, festivosiva);
        a.calcularSalario();
        a.mostrarResultado();
    }

class Salario{
    double vd, i, salario;
    int nd;
    
    Salario(int numerodias, double valordia, double iva){
        nd = numerodias;
        vd = valordia;
        i = iva;
    }
    public void calcularSalario(){
        salario = (nd * vd) - ((nd * vd) * (i/100));
    }
    public void mostrarResultado(){
        System.out.println("\nSALARIO NETO = " + salario);
    }
}
}
   
    
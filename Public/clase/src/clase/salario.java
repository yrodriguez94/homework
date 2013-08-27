package clase;

import java.util.Scanner;

public class salario {
	
public static void main(String[] args) {
			
			int diafes,prodmin,proddia,jornal,horatrb,total;
			double result;
			int diasfes=30000;
			Scanner teclado=new Scanner (System.in);
			
			System.out.println("Dias festivos");
			diafes=teclado.nextInt();
			
			System.out.println("digite el producido minimo diario");
			prodmin=teclado.nextInt();
			
			System.out.println("digite el digite las horas trabajadas");
			horatrb=teclado.nextInt();
			
			System.out.println("digite dias trabajados");
			jornal=teclado.nextInt();
			
			total=prodmin*jornal*diafes;
			
			
			
			if (prodmin>=30000) {
				result=total+(prodmin*0.10);
			    System.out.println("el trabajador "+ " dias festivos "+diasfes+"" +
						" con una produccion minima de "+prodmin+
						" con una duracion de horas de trabajo de "+horatrb+
						" y total de dias trabajados es de " +jornal+" su salario es de "+result);

				
			} else {
				
				
				System.out.println("el trabajador "+" con dias festivos "+diasfes+"pesos" +
						" con una produccion minima de "+prodmin+
						" con una duracion de horas de trabajo de "+horatrb+" horas"+
						" y total de dias trabajados es de " +jornal+" su salario es de "+total);

			}
			
			
			
			
			
			
			

		}

	}



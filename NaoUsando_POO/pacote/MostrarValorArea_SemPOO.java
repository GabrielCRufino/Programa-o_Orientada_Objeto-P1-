package pacote;

import java.util.Locale;
import java.util.Scanner;

public class MostrarValorArea_SemPOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;  
		
		System.out.println("Coloque as medidas do triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
				
		System.out.println("Colocar as medidas do triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble(); 
				
		double p = (xA+xB+xC)/2.0;
		double Areax = Math.sqrt( p * (p-xA) * (p-xB) * (p-xC) );
		
		p = (yA+yB+yC)/2.0;
		double Areay = Math.sqrt( p * (p-yA) * (p-yB) * (p-yC) );
		
		System.out.printf("Area do triangulo x: %.4f%n", Areax);
		System.out.printf("Area do triangulo y: %.4f%n", Areay);
		
		
		if(Areax > Areay) {
			System.out.println("Maior area: x");
		}else {
			System.out.println("Maior area: Y");
		}
		
		
		sc.close();
	}

}

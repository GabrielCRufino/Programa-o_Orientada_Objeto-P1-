package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Coloque as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
				
		System.out.println("Colocar as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble(); 
				
		
		double Areax = x.area();
		
		
		double Areay = y.area();
		
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

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre as medidas do triângulo x:");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		
		System.out.println("Entre as medidas do triângulo y:");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		System.out.printf("Área do triângulo X: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A área do X é maior");
		}
		else {
			System.out.println("A área do Y é maior");
		}
		
		scan.close();
	}
}

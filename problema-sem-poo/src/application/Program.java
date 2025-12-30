package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double xa, xb, xc, ya, yb, yc;
		
		System.out.println("Entre as medidas do triângulo x:");
		xa = scan.nextDouble();
		xb = scan.nextDouble();
		xc = scan.nextDouble();
		
		System.out.println("Entre as medidas do triângulo y:");
		ya = scan.nextDouble();
		yb = scan.nextDouble();
		yc = scan.nextDouble();
		
		double p = (xa + xb + xc) / 2.0;
		double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
		
		p = (ya + yb + yc) / 2.0;
		double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
		
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

package Basic;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculatorCircunference;

public class Circunference {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = CalculatorCircunference.circumference(radius);
		
		double v = CalculatorCircunference.volume(radius);
		
		System.out.printf("circuference: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		
		System.out.printf("PI value: %.2f%n", CalculatorCircunference.PI);
		
		sc.close();
	}
}

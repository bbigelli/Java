package Basic;

import java.util.Locale;
import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, Triangle, Circle, Trapeze, Square, Rectangle;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		Triangle = A * C / 2.0;
		Circle = 3.14159 * C * C;
		Trapeze = (A + B) / 2.0 * C;
		Square = B *B;
		Rectangle = A * B;
		System.out.printf("Triangle: %.3f%n", Triangle);
		System.out.printf("Circle: %.3f%n", Circle);
		System.out.printf("Trapeze: %.3f%n", Trapeze);	
		System.out.printf("Square: %.3f%n", Square);
		System.out.printf("Rectangle: %.3f%n", Rectangle);
			
		sc.close();
		
	}

}

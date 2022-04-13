package Basic;

import java.util.Locale;
import java.util.Scanner;

public class Vectors_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount of heights to calculate the average: ");
		int n = sc.nextInt();
		System.out.print("Enter the heigths: ");
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();			
		}
		
		double sum = 0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("Average price: %.2f%n" + avg);
		
		sc.close();
	}

}

package Basic;

import java.util.Locale;
import java.util.Scanner;

public class measuresTriangle {

    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);    	
    	Scanner sc = new Scanner(System.in);
    	double xA, xB, xC, yA, yB, yC;
    	// Test values to triangle X: 3.00, 4.00, 5.00
    	System.out.println("Enter the measures of triangle X: ");
    	xA = sc.nextDouble();
    	xB = sc.nextDouble();
    	xC = sc.nextDouble();
    	
    	// Test values to triangle Y: 7.50, 4.50, 4.02
    	System.out.println("Enter the measures of triangle Y: ");
    	yA = sc.nextDouble();
    	yB = sc.nextDouble();
    	yC = sc.nextDouble();
    	
    	double p = (xA + xB + xC) / 2;
    	double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
    	
    	p = (yA + yB + yC) / 2;
    	double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
    	
    	System.out.printf("Triangle X area: %4f%n", areaX);
    	
    	System.out.printf("Triangle Y area: %4f%n", areaY);
    	
    	if (areaX > areaY) {
    		System.out.println("larger area: Triangle X");
    	}
    	else {
    		System.out.println("larger area: Triangle Y");
    	}
    	
    	sc.close();
    }
    
}

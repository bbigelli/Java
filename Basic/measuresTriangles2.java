package Basic;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class measuresTriangles2 {
	
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        // Test values to triangle X: 3.00, 4.00, 5.00
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        // Test values to triangle Y: 8.50, 5.50, 4.20
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %4f%n", areaX);

        System.out.printf("Triangle Y area: %4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: Triangle X");
        }
        else {
            System.out.println("Larger area: Triangle Y");
        }

        sc.close();
    }
}
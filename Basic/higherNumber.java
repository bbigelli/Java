package Basic;

import java.util.Scanner;

public class higherNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b  && a > c ) {
            System.out.printf("Higher = " + a);
        }
        else if (b > c) {
            System.out.printf("Higher = " + b);
        }
        else {
            System.out.printf("Higher = " + c);
        }

        sc.close();
    }
}
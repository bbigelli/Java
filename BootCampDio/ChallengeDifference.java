package BootCampDio;

import java.io.IOException;
import java.util.Scanner;

public class ChallengeDifference {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int difference = (a * b - c * d);
        System.out.println("DIFERENÇA = " + difference);
        
        sc.close();
    }
	
}

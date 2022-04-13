package BootCampDio;

import java.io.IOException;
import java.util.Scanner;

public class ChallengeOdd {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cont = 0;
        while (cont < 6) {
        	if (x % 2 != 0) {
        		System.out.println(x);
        		cont++ ;
        	}
        	x++;
        }
        sc.close();
    }	
}

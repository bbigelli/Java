package BootCampDio;

import java.util.Scanner;

public class ChallengeProduct {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, Product;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		Product = A * B;
		
		System.out.println("Product = " + Product);
		
		sc.close();
		
	}
}

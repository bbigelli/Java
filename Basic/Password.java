package Basic;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password: ");
		int password = sc.nextInt();
		
		while (password != 2002) {
			System.out.println("Password incorrect, try again.");
			password = sc.nextInt();
		}
		
		System.out.println("Access Allowed, Welcome!");
		
		sc.close();
	}
}
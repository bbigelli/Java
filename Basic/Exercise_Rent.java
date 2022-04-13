package Basic;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Exercise_Rent {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Enter the student name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Enter the student email: ");
			String email = sc.nextLine();
			System.out.print("Enter the room number: ");
			int room = sc.nextInt();
			System.out.println();
			vect[room] = new Rent(name , email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		
		sc.close();
	}

}

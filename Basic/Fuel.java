package Basic;

import java.util.Scanner;

public class Fuel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int x = 0; //Alcohol
        int y = 0; //Petrol
        int z = 0; //Diesel
        
        int tipe = sc.nextInt();
        
        while (tipe != 4) {
        	if(tipe ==1) {
        		x = x + 1;
        	}
        	else if (tipe == 2) {
        		y = y +1;
        	}        		
        	else if (tipe == 3) {
        		z = z + 1;
        	}
        	
        	tipe = sc.nextInt();
        	
        }
        
        System.out.println("Thanks you!");
        System.out.println("Alcohol: " + x);
        System.out.println("Petrol: " + y);
        System.out.println("Diesel: " + z);
        
        sc.close();  
   }
}

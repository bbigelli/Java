package Basic;

import java.util.*;

public class Coordinates {
	   public static void main(String []argh){
		   
	        Scanner sc = new Scanner(System.in);
	        
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        
	        while (x != 0 && y != 0) {
	        	if(x > 0 && y > 0) {
	        		System.out.println("First");
	        	}
	        	else if (x <0 && y > 0) {
	        		System.out.println("Second");
	        	}
	        	else if (x < 0 && y < 0){
	        		System.out.println("Third");
	        	}
	        	else{
	        		System.out.println("Fourth");
	        	}
	        	x = sc.nextInt();
	        	y = sc.nextInt();
	        	
	        }
	        
	        sc.close();  
	   }
}
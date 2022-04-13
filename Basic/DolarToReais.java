package Basic;

import java.util.Locale;
import java.util.Scanner;

import entities.Exchange;

public class DolarToReais {

    public static void main(String[] args) {

    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner (System.in);
    	
    	System.out.println("What is the dollar price? ");
    		double dollar = sc.nextDouble();
    		System.out.printf("Current dollar value is: %.2f reais", dollar);
    		
    	System.out.println();
       	System.out.println("How many dollar will be bought? ");
       		double quantity = sc.nextDouble();
       		double convertedValue = Exchange.converter(dollar, quantity); 
       		
       	System.out.printf("Amount to be paid in reais: %.2f", convertedValue);
       	 
       		sc.close();       			  
    }
}
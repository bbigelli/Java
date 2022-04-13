package BootCampDio;

import java.io.IOException;
import java.util.Scanner;

public class  ChallengeAge {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int accountant = 0;
        int age = 1;
        double sum = 0;
        
        while (age > 0) {
            age = sc.nextInt();
            if (age > 0) { 
            	
            	sum += age;
            	accountant += 1;
            }
        }
        double average = sum / accountant;
        System.out.println(String.format("%.2f", average));
        
        sc.close();
        
    }
	
}


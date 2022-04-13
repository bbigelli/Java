package BootCampDio;

import java.io.IOException;
import java.util.Scanner;

public class ChallengeAnalysisNumbers {
	
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int even = 0;
        int odd = 0;
        int n; 

        for (int i = 0; i < 5; i++) {
        	
        	n = sc.nextInt();
        	
        	if(n % 2 == 0) {
        		even++;
          	}
        	else { 
        		odd++;
        	}
        	
        	if(n > 0) positive++;
        	if(n <0) negative++;
        	
        }
        System.out.println(even + " Even numbers");
        System.out.println(odd + " Odd numbers");
        System.out.println(positive + " Positives");
        System.out.println(negative + " Negatives");
        
        sc.close();
    }
	
}
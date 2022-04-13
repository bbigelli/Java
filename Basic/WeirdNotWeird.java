package Basic;

import java.util.*;

public class WeirdNotWeird {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        int N = scanner.nextInt();
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		        
		        if ((N % 2 == 0) && (N >= 2) && (N <= 5)) {
		        	System.out.print("Not Weird");
		        }
		        else if ((N % 2 == 0) && (N >= 6) && (N <= 20)) {
		        	System.out.print("Weird");
		        }
		        else if ((N % 2 == 0)&& (N > 20)) {
		        	System.out.print("Not Weird");		        	
		        }
		        else if (N % 2 == 0) {
			        	System.out.print("Not Weird");
			        }		        
		        else {
		        	System.out.print("Weird");
		        }
		        scanner.close();
	}
}
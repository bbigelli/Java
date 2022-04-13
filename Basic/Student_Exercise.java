package Basic;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Student_Exercise {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the student name: ");
			Student student = new Student();
			student.name = sc.nextLine();
			
		System.out.printf("Enter first assessment: ");
		student.grade1 = sc.nextDouble();
		System.out.printf("Enter second assessment: ");
		student.grade2 = sc.nextDouble();
		System.out.printf("Enter tirdy assessment: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
		System.out.println("FAILED");
		
		System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		
		}
		else {
		System.out.println("PASS");
		}
		
		sc.close();
	}
}

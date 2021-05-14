package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class studentProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student a = new Student();	
		Student b = new Student();
		
		System.out.println("name : ");
		a.name = sc.nextLine();
		System.out.println("grade 1 : ");
		a.grade1 = sc.nextDouble();
		System.out.println("grade 2 : ");
		a.grade2 = sc.nextDouble();
		System.out.println("grade 3 : ");
		a.grade3 = sc.nextDouble();
		
		System.out.println(" the media is : " + a.media());
		
		if (a.media() >= 60.0) {
			System.out.println(a.name + " PASS");
		} else {
			System.out.println(a.name + " FAILED");
			double missingpoints = 60.0 - a.media();
			System.out.println ("MISSING " + missingpoints + " POINTS");
		}
		
		System.out.println("name : ");
		b.name = sc.next();
		System.out.println("grade 1 : ");
		b.grade1 = sc.nextDouble();
		System.out.println("grade 2 : ");
		b.grade2 = sc.nextDouble();
		System.out.println("grade 3 : ");
		b.grade3 = sc.nextDouble();
		
		System.out.println(" the media is : " + b.media());
		
		if (b.media() >= 60.0) {
			System.out.println(b.name + " PASS");
		} else {
			System.out.println(b.name + " FAILED");
			double missingpoints = 60.0 - b.media();
			System.out.println ("MISSING " + missingpoints + " POINTS");
		}
		
		sc.close();

	}

}

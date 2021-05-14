package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Functionary;

public class functionaryProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Functionary emp = new Functionary();
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.salary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp.name + " , " + emp.netSalary());
		
	
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + emp.name + " , $" + emp.netSalary());
		sc.close();
	}
}

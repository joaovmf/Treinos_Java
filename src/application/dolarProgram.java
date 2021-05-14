package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dolar;

public class dolarProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Whats the dollar price ? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought ?");
		double amount = sc.nextDouble();
		double result = Dolar.dollarToReal(amount,dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n" , result);
		
		
		sc.close();

	}

}

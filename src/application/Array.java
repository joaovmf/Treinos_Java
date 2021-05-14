package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Array2;

public class Array {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
	
		Array2 [] vect = new Array2 [10];
		
		System.out.print("How many rooms are be rented : ");
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name : ");
			String name = sc.next();
			System.out.print("E-mail : ");
			String email = sc.next();
			System.out.print("room : ");
			int room = sc.nextInt();
			vect [room] = new Array2 (name,email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}

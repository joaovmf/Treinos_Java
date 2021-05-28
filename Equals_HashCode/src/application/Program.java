package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		String a = "Maria";
		String b = "Alex";
		String c = "Maria";
		
		System.out.println(a.equals(b));
		
		System.out.println(a.equals(c));
		
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		Client c1 = new Client ("Alex" , "maria@maria");
		Client c2 = new Client ("Alex", "alex@alex");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}

}

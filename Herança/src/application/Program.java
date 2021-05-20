package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Account acc = new Account(1001, "joao", 1000.0);
		acc.withdraw(200.00);
		System.out.println(acc.getBalance());
		BusinessAccount bacc = new BusinessAccount (1002,"maria",0.0, 500.0);
		
		//UPCASTING 
		
		Account acc1 = bacc;
		
		Account acc2 = new BusinessAccount (1003,"bob",1000.0, 200.0);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new SavingAccount (1004, "Anna", 1000.0, 0.01);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
		
		//DOWNCASTING
		 
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.00);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("loan");
		}
		
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//POLIMORFISMO 
		
		Account x = new Account(1020, "Alex", 1000.00);
		Account y = new SavingAccount(1023, "Maria", 1000.00, 0.1);
		
		x.withdraw(50.00);
		y.withdraw(50.00);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		sc.close();
	}

}

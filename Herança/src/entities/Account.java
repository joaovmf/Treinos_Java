package entities;

public class Account {
	private int account;
	private String holder;
	protected double balance;
	
	public Account () {
		
	}
	
	public Account(int account, String holder, double balance) {
		this.account = account;
		this.holder = holder;
		this.balance = balance;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	
	
}

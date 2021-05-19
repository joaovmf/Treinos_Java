package entities;

public class SavingAccount extends Account{
	private double interestRate;
	
	public SavingAccount () {
		super();
	}

	public SavingAccount(int account, String holder, double balance, double interestRate) {
		super(account, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance () {
		balance += balance * interestRate;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	@Override
	public void withdraw (double amount) {
		balance -= amount;
	}
	
	
}

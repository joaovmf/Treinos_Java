package entities;

public class BusinessAccount extends Account {
	
	private double loanLimit;
	
	public BusinessAccount () {
		super();
	}

	public BusinessAccount(int account, String holder, double balance, double loanLimit) {
		super(account, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan (double amount) {
		if (amount <= loanLimit) {
		balance += amount - 10.0; //liberei utilizando o protected
		}
		
		
	}
	
	@Override
	public void withdraw (double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	

}

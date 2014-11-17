package chapter4ObjectOrientation;

public class Account {
	public int numberAccount;
	public double limitAccount;
	public double balanceAccount;
	Client clientAccount = new Client();
	
	public boolean withdraw(double value) {
		double balance = this.balanceAccount;
		this.balanceAccount -= value;
		
		if(this.balanceAccount <= balance) {
			return true;
		}
		return false;	
	}
	
	public boolean deposit(double value) {
		double balance = this.balanceAccount;
		this.balanceAccount += value;
		
		if (balance < this.balanceAccount) {
			return true;
		}
		return false;
	}
	
	public boolean transferTo(Account destination, double value) {
		boolean isWithdraw = this.withdraw(value);
		
		if (isWithdraw) {
			destination.deposit(value);
			return true;
		}
		return false;
	}
}

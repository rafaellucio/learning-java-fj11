package chapter4ObjectOrientation;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account newAccount = new Account();
		Client newClient = new Client();
		newAccount.clientAccount = newClient;
		
		newClient.name = "Rafael";
		newClient.lastName = "Antonio Lucio";
		newAccount.balanceAccount = 1000.0;
		
		newAccount.withdraw(200);
		newAccount.deposit(500);
		
		System.out.println("Saldo atual: " + newAccount.balanceAccount);
	}

}

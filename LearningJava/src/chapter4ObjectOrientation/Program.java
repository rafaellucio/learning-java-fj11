package chapter4ObjectOrientation;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account newAccount;
		newAccount = new Account();
		newAccount.client = "Rafael Antonio Lucio";
		newAccount.value = 1000.0;
		
		System.out.println("Saldo atual: " + newAccount.value);
	}

}

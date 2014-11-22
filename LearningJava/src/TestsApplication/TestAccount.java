package TestsApplication;
import static org.junit.Assert.*;
import org.junit.Test;
import chapter4ObjectOrientation.Account;

public class TestAccount {

	@Test
	public void testWithdraw() {
		Account account = new Account();
		account.balanceAccount = 10;
		
		assertTrue(account.withdraw(5));
		assertTrue(account.balanceAccount == 5);
	}
	
	@Test
	public void testDeposit() {
		Account account = new Account();
		account.balanceAccount = 10;
		
		assertTrue(account.deposit(5));
		assertTrue(account.balanceAccount == 15);
	}
	
	@Test
	public void testReferencesAccounts() {
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = account1;
		
		assertFalse(account1 == account2);
		assertEquals(account1, account3);
	}
	
	@Test
	public void testTtransfer(){
		Account account1 = new Account();
		account1.balanceAccount = 10;
		Account account2 = new Account();
		account2.balanceAccount = 5;
		
		assertTrue(account1.transferTo(account2, 5.3));
		assertTrue(account2.balanceAccount == 10.3);
	}
}
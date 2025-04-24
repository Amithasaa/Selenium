package TestNG.tutoria2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class CheckOutTest {
	
	@Test
	public void testCheckoutCreditCard() {
		System.out.println("Validate checkout by valid creditcard");
	}
	
	@Test
	public void testCheckoutUPI() {
		System.out.println("Validate checkout by valid UPI handle");
	}
	
	@Test
	public void testCheckoutDebitCard() {
		System.out.println("Validate checkout by valid debit card");
	}
	
	@Test
	public void testCheckoutCOD() {
		System.out.println("Validate checkout by valid CASH ON DELIVERY");
	}
	
	@Test
	public void testCheckoutWallet() {
		System.out.println("Validate checkout by valid debit card");
	}
	
	
	public void testCheckoutPayLater() {
		System.out.println("Validate checkout by pay later mechanism");
	}
	
	@Test
	public void testCheckoutInvalidDebit() {
		System.out.println("Validate checkout by invalid debit card");
	}
	
	@AfterSuite
	public void cleanUp() {
		System.out.println("Logging out user and closing the browser session");
	}
}
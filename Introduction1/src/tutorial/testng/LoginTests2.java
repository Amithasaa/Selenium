package tutorial.testng;

import org.testng.annotations.Test;

public class LoginTests2 {
		@Test(priority = 5)
		public void regression_ValidLogin() {
		// TODO Auto-generated method stub
		System.out.println("Validate that the registered user is able to login with valid credentials "); 
		} 
		@Test(priority = 3)
		public void regression_UnregisteredLogin() {
		System.out.println("Validate that user gets the correct error message with unregistered email id during login");
		}
		@Test(priority = 4)
		public void regression_UpdateProfile() {
		System.out.println("Validate that user is able to update the profile");
		}
		@Test(priority = 2)
		public void smoke_HomepageLoad() {
		System.out.println("Validate that user navigates to the homepage with valid credentials and home page loads");
		}
		@Test(priority = 1)
		public void smoke_CreateAccount() {
		System.out.println("Validate that user is able to create account with unregistered and valid mail ID");
		}

	}



//package tutorial.testng;

//
//import org.testng.annotations.Parameters;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class LoginTests {
//
//@BeforeClass	
//public void SetUp() {
//	System.out.println("Initialising WebDriver and setting up test prequisites");
//}
////@AfterClass 
////public void testValidLogin(){
////		// TODO Auto-generated method stub
////		System.out.println("Validate that the registered user is able to login with valid credentials");
////	}
//
////(groups = {"smoke" , "regression"})
////(dependsOnMethods = "userRegistration")
//
//@Test 
//@Parameters ("username")
//public void testValidLogin(String username){
//		// TODO Auto-generated method stub
//		System.out.println("Validate that the registred user is able to login with valid credentials");
//		System.out.println(username);
//	}
//
////(groups = {"smoke"})
////(dependsOnMethods = "userRegistration")
//@Test  @Parameters ("appURL")
//public void testUnregisteredLogin(String appURL){
//		// TODO Auto-generated method stub
//		System.out.println("Validate that user gets the correct error message with unregistered email id during login");
//		System.out.println(appURL);
//	}
//
////(groups = {"smoke" , "regression"})
//
//@Test 
//public void testInvalidCredentialsLogin() {
//	System.out.println("Validate that user gets the correct error message with registered email id and wrong password");
//	}
//
//// (dependsOnMethods = {"userRegistration", "testInvalidCredentialsLogin"})
//@Test 
//public void testInvalidEmail() {
//	System.out.println("Validate that user gets the correct error message with invalid email format");
//	Assert.fail("I was forced to fail");
//	}
//
////(groups = "regression") 
////(enabled = false)
//@Test (dependsOnMethods = "testInvalidEmail")
//public void testBlankEmailPassword() {
//	System.out.println("Validate that user gets the correct error message when keeping email or password blank");
//}
//
//@Test
//public void userRegistration() {
//	System.out.println("Validate that the user registration is successful");
//}
// 
////@AfterMethod
////public void refresh() {
////	System.out.println("Do the refresh action: automated");
////}
//
//}
//




package tutorial.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (tutorial.testng.TestNGListener.class)
public class LoginTests {

@BeforeClass	
public void SetUp() {
	System.out.println("Initialising WebDriver and setting up test prequisites");
}
//@AfterClass 
//public void testValidLogin(){
//		// TODO Auto-generated method stub
//		System.out.println("Validate that the registered user is able to login with valid credentials");
//	}


@Test 
public void testValidLogin(){
		// TODO Auto-generated method stub
		System.out.println("Validate that the registred user is able to login with valid credentials");
		
	}

@Test 
public void testUnregisteredLogin(){
		// TODO Auto-generated method stub
		System.out.println("Validate that user gets the correct error message with unregistered email id during login");
		
	}


@Test 
public void testInvalidCredentialsLogin() {
	System.out.println("Validate that user gets the correct error message with registered email id and wrong password");
	}

@Test 
public void testInvalidEmail() {
	System.out.println("Validate that user gets the correct error message with invalid email format");
	Assert.fail("I was forced to fail");
	}


@Test (dependsOnMethods = "testInvalidEmail")
public void testBlankEmailPassword() {
	System.out.println("Validate that user gets the correct error message when keeping email or password blank");
}

@Test
public void userRegistration() {
	System.out.println("Validate that the user registration is successful");
}
 
//@AfterMethod
//public void refresh() {
//	System.out.println("Do the refresh action: automated");
//}

}
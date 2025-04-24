package kodnest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import kodnest.pages.LoginPage;

public class KodLoginTests3 {
	WebDriver driver;
	String baseUrl = "https://app.kodnest.in/login";
	LoginPage loginpage;
	String invalidEmail;
	String unregisteredEmail;
	String registeredEmail;
	String wrongPassword;
	String correctPassword;
	
	@Parameters ({"invalidEmail","unregisteredEmail","registeredEmail","wrongPassword","correctPassword"})
	@BeforeClass
	public void setUp(String invalidEmail,String unregisteredEmail,String registeredEmail,String wrongPassword,String correctPassword) {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();	
		loginpage = new LoginPage(driver);
		this.invalidEmail = invalidEmail;
		this.unregisteredEmail = unregisteredEmail;
		this.registeredEmail = registeredEmail;
		this.wrongPassword = wrongPassword;
		this.correctPassword = correctPassword;
	}
	
	@Test (priority = 1)
	public void testBlankEmailAndPassword() {
		loginpage.clickLoginbutton();
		Assert.assertEquals(loginpage.getEmailRequiredError(), "Email is required");
		Assert.assertEquals(loginpage.getPasswordRequiredError(), "Please enter your password");
	}
	
	@Test (priority = 2)
	public void testInvalidEmailFormat() {
		loginpage.enterEmail(invalidEmail);
		loginpage.clickLoginbutton();
		Assert.assertEquals(loginpage.getInvalidEmailFormatError(), "Invalid email format");
	}
	
	@Test (priority = 3)
	public void testUnregisteredEmail() throws InterruptedException {
		loginpage.enterEmail(unregisteredEmail);
		loginpage.enterPassword(wrongPassword);
		loginpage.clickLoginbutton();
		Thread.sleep(1000);
		Assert.assertEquals(loginpage.getUserNotFoundError(),"User not found with this email address");
	}
	
	@Test (priority = 4) 
	public void testRegisteredMailWrongPassword() throws InterruptedException {
		loginpage.enterEmail(registeredEmail);
		loginpage.enterPassword(wrongPassword);
		loginpage.clickLoginbutton();
		Thread.sleep(1000);
		Assert.assertEquals(loginpage.getIncorrectCredentialsError(),"Incorrect Credentials");
	}
	
	@Test (priority = 5)
	public void testLoginWithValidCred() {
		loginpage.enterEmail(registeredEmail);
		loginpage.enterPassword(correctPassword);
		loginpage.clickLoginbutton();
		System.out.println("Home page loaded");
	}
	
	@AfterMethod
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
}

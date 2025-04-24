package kodnest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import kodnest.pages.LoginPage;

public class KodLoginTests2 {
	WebDriver driver;
	String baseUrl = "https://app.kodnest.in/login";
	LoginPage loginpage;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();	
		loginpage = new LoginPage(driver);
	}
	
	@Test (priority = 1)
	public void testBlankEmailAndPassword() {
		loginpage.clickLoginbutton();
		Assert.assertEquals(loginpage.getEmailRequiredError(), "Email is required");
		Assert.assertEquals(loginpage.getPasswordRequiredError(), "Please enter your password");
	}
	
	@Test (priority = 2)
	public void testInvalidEmailFormat() {
		loginpage.enterEmail("amitha.com");
		loginpage.clickLoginbutton();
		Assert.assertEquals(loginpage.getInvalidEmailFormatError(), "Invalid email format");
	}
	
	@Test (priority = 3)
	public void testUnregisteredEmail() throws InterruptedException {
		loginpage.enterEmail("amitha@gmail.com");
		loginpage.enterPassword("amitha@123");
		loginpage.clickLoginbutton();
		Thread.sleep(1000);
		Assert.assertEquals(loginpage.getUserNotFoundError(),"User not found with this email address");
	}
	
	@Test (priority = 4) 
	public void testRegisteredMailWrongPassword() throws InterruptedException {
		loginpage.enterEmail("amithaamitha290@gmail.com");
		loginpage.enterPassword("amitha12");
		loginpage.clickLoginbutton();
		Thread.sleep(1000);
		Assert.assertEquals(loginpage.getIncorrectCredentialsError(),"Incorrect Credentials");
	}
	
	@Test (priority = 5)
	public void testLoginWithValidCred() {
		loginpage.enterEmail("amithaamitha290@gmail.com");
		loginpage.enterPassword("Amitha@123");
		loginpage.clickLoginbutton();
		System.out.println("Home page loaded");
	}
	
	@AfterMethod
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
}

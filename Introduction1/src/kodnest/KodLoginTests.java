package kodnest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KodLoginTests {
	WebDriver driver;
	String baseUrl = "https://app.kodnest.in/login";
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();	
	}
	
	@Test (priority = 1)
	public void testBlankEmailAndPassword() throws InterruptedException {
		driver.findElement(By.id("login-submit-button")).click();
		String actualEmailError = driver.findElement(By.xpath("//p[@id='email-error' and text()='Email is required']")).getText();
		Thread.sleep(1000);
		String actualPasswordError = driver.findElement(By.xpath("//p[@id='password-error' and text()='Please enter your password']")).getText();
		
		Assert.assertEquals(actualEmailError, "Email is required");
		Assert.assertEquals(actualPasswordError, "Please enter your password");
	}
	
	@Test (priority = 2)
	public void testInvalidEmailFormat() throws InterruptedException {
		WebElement emailField = driver.findElement(By.id("email-input"));
		emailField.sendKeys("amitha.com");
		driver.findElement(By.id("login-submit-button")).click();
		Thread.sleep(1000);
		String actualInvaliEmailError = driver.findElement(By.xpath("//p[@id='email-error' and text()='Invalid email format']")).getText();
		
		Assert.assertEquals(actualInvaliEmailError, "Invalid email format");
	}
	
	@Test (priority = 3)
	public void testUnregisteredEmail() throws InterruptedException {
		driver.findElement(By.id("email-input")).sendKeys("amitha@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("amitha123");
		driver.findElement(By.id("login-submit-button")).click();
		Thread.sleep(1000);
		String actualUserNotFoundMsg = driver.findElement(By.xpath("//div[@data-title='' and text()='User not found with this email address']")).getText();
	
		Assert.assertEquals(actualUserNotFoundMsg,"User not found with this email address");
	}
	
	@Test (priority = 4) 
	public void testRegisteredMailWrongPassword() throws InterruptedException {
		driver.findElement(By.id("email-input")).sendKeys("amithaamitha290@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("amitha123");
		driver.findElement(By.id("login-submit-button")).click();
		Thread.sleep(1000);
		String actualIncorrectCredentialMsg = driver.findElement(By.xpath("//div[@data-title='' and text()='Incorrect Credentials']")).getText();
	
		Assert.assertEquals(actualIncorrectCredentialMsg,"Incorrect Credentials");
	}
	
	@Test (priority = 5)
	public void testLoginWithValidCred() {
		driver.findElement(By.id("email-input")).sendKeys("amithaamitha290@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("Amitha@123");
		driver.findElement(By.id("login-submit-button")).click();
		System.out.println("Home page loaded");
	}
	
	@AfterMethod
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
}

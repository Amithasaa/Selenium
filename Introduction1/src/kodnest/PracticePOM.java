package kodnest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticePOM {
	
	WebDriver driver;
	String url = "https://app.kodnest.in/login";
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void testBlankEmailandPassword() {
		driver.findElement(By.id("login-submit-button")).click();
		String actualError = driver.findElement(By.id("email-error")).getText();
		String actualPassError = driver.findElement(By.id("password-error")).getText();
		Assert.assertEquals(actualError, "Email is required");
		Assert.assertEquals(actualPassError, "Please enter your password");
	}
	
	@Test(priority = 2)
	public void testInvalidEmailFormat() {
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("amitha@");
		driver.findElement(By.id("login-submit-button")).click();
		String actualInvalidemail = driver.findElement(By.id("email-error")).getText();
		Assert.assertEquals(actualInvalidemail, "Invalid email format");	
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
}

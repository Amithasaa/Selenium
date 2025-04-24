package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException{
			// TODO Auto-generated method stub
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://app.kodnest.in/login");
	        WebElement emailAddressField = driver.findElement(By.id("email-input"));
	        emailAddressField.sendKeys("amithaamitha290@gmail.com");
	        WebElement passwordField = driver.findElement(By.name("password"));
	        passwordField.sendKeys("Amitha@123");
	        passwordField.click();
	        WebElement loginButton = driver.findElement(By.id("login-submit-button"));
	        loginButton.click();
	        System.out.println(loginButton.getTagName());
	        System.out.println(loginButton.getDomAttribute("id"));
	        System.out.println(loginButton.getText());
	        driver.findElement(By.cssSelector(""));
	        driver.findElement(By.linkText(""));
	        
	        driver.findElement(By.name("email"));
	        driver.findElement(By.partialLinkText(""));
	        driver.findElement(By.tagName(""));
	        driver.findElement(By.xpath(""));
	        }
}




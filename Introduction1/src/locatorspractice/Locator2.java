package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement button2 = driver.findElement(By.id("but2"));
		System.out.println(button2.isEnabled());
		System.out.println(button2.isDisplayed());
		WebElement button1 = driver.findElement(By.id("but1"));
		System.out.println(button1.isEnabled());
		System.out.println(button1.isDisplayed());
		System.out.println(button1.isSelected());
		System.out.println(button1.getText());
		Dimension button1size = button1.getSize();
		System.out.println(button1size);
		System.out.println(button1size.width);
		System.out.println(button1size.height);
		System.out.println(button1.getLocation());
//        driver.get("https://app.kodnest.in/login");
//        WebElement emailAddressField = driver.findElement(By.id("email-input"));
//        emailAddressField.sendKeys("amithaamitha290@gmail.com");
//        WebElement passwordField = driver.findElement(By.name("password"));
//        passwordField.sendKeys("Amitha@123");
//        passwordField.click();
//        WebElement loginButton = driver.findElement(By.id("login-submit-button"));
//        loginButton.click();
//        System.out.println(loginButton.getTagName());
//        System.out.println(loginButton.getDomAttribute("id"));
//        System.out.println(loginButton.getText());
//        driver.findElement(By.cssSelector(""));
//        driver.findElement(By.linkText(""));
//        
//        driver.findElement(By.name("email"));
//        driver.findElement(By.partialLinkText(""));
//        driver.findElement(By.tagName(""));
//        driver.findElement(By.xpath(""));
	}

}

package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.amazon.in/ref=nav_logo");
  WebElement bestsellerlink = driver.findElement(By.partialLinkText("Best Sellers"));
  bestsellerlink.click();
  System.out.println(driver.getCurrentUrl());
	}

}

package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassFillForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.kodnest.com/");
	       Actions act = new Actions(driver);
	       WebElement nameInput = driver.findElement(By.id("form-field-name"));
	       act.click(nameInput).sendKeys("Amitha")
	                           .sendKeys(Keys.TAB)
	                           .sendKeys("amitha@gmail.com")
	                           .sendKeys(Keys.TAB)
	                           .sendKeys("9997764433")
	                           .sendKeys(Keys.TAB)
	                           .sendKeys(Keys.ENTER)
	                           .sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
	                           .sendKeys(Keys.ENTER)
	                           .sendKeys(Keys.TAB)
	                           .sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
	                           .sendKeys(Keys.TAB)
	                           .sendKeys("kod001")
	                           .sendKeys(Keys.TAB).sendKeys(Keys.RIGHT)
	                           .build().perform();
	}

}

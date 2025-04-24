package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.globalsqa.com/");
	       Actions act = new Actions(driver);
	       WebElement facebook = driver.findElement(By.className("icon_facebook"));
	       WebElement google = driver.findElement(By.className("icon_google"));
	       WebElement linkedin = driver.findElement(By.className("icon_linkedin"));
	       WebElement twitter = driver.findElement(By.className("icon_twitter"));
	       WebElement pinterest = driver.findElement(By.className("icon_pinterest"));
	       act.moveToElement(facebook).keyDown(Keys.CONTROL).click().moveToElement(google).click().moveToElement(linkedin).click().moveToElement(twitter).click().moveToElement(pinterest).click().release().build().perform();
	       //Thread.sleep(3000);
//	       registerDemoButton.click();
	}
}
	



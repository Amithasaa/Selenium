package windowhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kodnest.com/");
        Actions act = new Actions(driver);
        WebElement find = driver.findElement(By.xpath("//span[text()='Talk to a Career Expert']"));
        act.moveToElement(find).click().build().perform();
        WebElement send = driver.findElement(By.id("form-field-name"));
        act.click(send).sendKeys("Amitha")
        .sendKeys(Keys.TAB)
        .sendKeys("amithasa@gmail.com")
        .sendKeys(Keys.TAB)
        .sendKeys("44444444444")
        .sendKeys(Keys.TAB)
        .sendKeys(Keys.ENTER);
	}
}
	

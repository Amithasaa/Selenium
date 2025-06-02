import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class selectable {

	@Test
	public void selecttable() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		
		WebElement fram = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fram);

		List<WebElement> lis = driver.findElements(By.cssSelector("#selectable li"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(lis.get(0)).moveToElement(lis.get(2)).release().build().perform();
		Thread.sleep(2000);
		
	}
}

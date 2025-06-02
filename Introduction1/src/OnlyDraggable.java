import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OnlyDraggable {
	
	@Test
	public void draggable() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		WebElement fram = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fram);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 120,130).build().perform();
		
		driver.switchTo().defaultContent();
		
	}
}

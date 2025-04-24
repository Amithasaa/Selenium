package iframehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://jqueryui.com/draggable/");
	       WebElement myIframe = driver.findElement(By.className("demo-frame"));
	       driver.switchTo().frame(myIframe);
	       WebElement draggable = driver.findElement(By.id("draggable"));
	       Actions act = new Actions(driver);
	       act.dragAndDropBy(draggable, 125, 100).build().perform();
	       driver.switchTo().defaultContent();
	       driver.findElement(By.xpath("//a[text()='Autocomplete']"));
	}

}

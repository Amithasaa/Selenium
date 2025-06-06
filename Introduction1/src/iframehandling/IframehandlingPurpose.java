package iframehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframehandlingPurpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://jqueryui.com/droppable/");
	       WebElement myIframe = driver.findElement(By.className("demo-frame"));
	       driver.switchTo().frame(myIframe);
	       WebElement source = driver.findElement(By.id("draggable"));
	       WebElement target = driver.findElement(By.id("droppable"));
	       Actions act = new Actions(driver);
	       act.dragAndDrop(source, target).build().perform();
	       
	       driver.switchTo().defaultContent();
	       driver.findElement(By.xpath("//a[text()='Autocomplete']"));
	}

}

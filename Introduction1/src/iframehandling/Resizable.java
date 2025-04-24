package iframehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://jqueryui.com/resizable/");
	       WebElement myIframe = driver.findElement(By.cssSelector(".demo-frame"));
	       driver.switchTo().frame(myIframe);
	       WebElement resizableElement = driver.findElement(By.id("resizable"));
	       WebElement resizabbleElement = driver.findElement(By.className("ui-icon-gripsmall-diagonal-se"));
	       Actions act = new Actions(driver);
	       act.clickAndHold(resizabbleElement).moveByOffset(500,30).release().build().perform();
	       
	       driver.switchTo().defaultContent();
	       driver.findElement(By.xpath("//a[text()='Autocomplete']"));
	}

}

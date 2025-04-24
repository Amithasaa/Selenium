package iframehandling;

import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class selectablePage {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.jqueryui.com/selectable/");
			
			//selenium please change focus to iframe
			WebElement myIframe = driver.findElement(By.cssSelector(".demo-frame"));
			WebElement controlGroup = driver.findElement(By.xpath("//a[text()='Controlgroup']"));
			
			Actions act = new Actions(driver);
			act.moveToElement(controlGroup).build().perform();
			driver.switchTo().frame(myIframe);
			List<WebElement> itemList = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
				
			
			act.keyDown(Keys.CONTROL)
				.click(itemList.get(1))
				.click(itemList.get(4))
				.click(itemList.get(5))
				.click(itemList.get(6))
				.release()
				.build().perform();
			driver.switchTo().defaultContent();
			
			
		}
	}
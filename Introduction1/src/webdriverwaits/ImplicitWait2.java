package webdriverwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		WebElement addButton1 = driver.findElement(By.id("btn1"));
		WebElement addButton2 = driver.findElement(By.id("btn2"));
		addButton1.click();
		addButton2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement textbox1 = driver.findElement(By.id("txt1"));
		WebElement textbox2 = driver.findElement(By.id("txt2"));
		textbox1.sendKeys("Amitha");
		textbox2.sendKeys("S A");
	}

}

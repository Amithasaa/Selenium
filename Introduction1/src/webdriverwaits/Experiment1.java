package webdriverwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement heading1 = driver.findElement(By.xpath("//div[@class='example']/h3"));
		WebElement heading2 = driver.findElement(By.xpath("//div[@class='example']/h4"));
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
		startButton.click();
		WebElement welcomeMessage = driver.findElement(By.id("finish"));
		//Thread.sleep(20000);
		System.out.println(welcomeMessage.getText());
		System.out.println(heading1.getText());
		System.out.println(heading2.getText());

	}

}

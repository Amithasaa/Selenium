package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsHandling3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(3000);
        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(3000);
        Alert promptBox = driver.switchTo().alert();
        promptBox.sendKeys("Selenium with Java");
        promptBox.accept();
	}

}

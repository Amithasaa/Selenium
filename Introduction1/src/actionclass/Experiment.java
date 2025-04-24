package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
//	       driver.get("https://www.globalsqa.com/");
//	       
//	       Thread.sleep(3000);
//	       driver.findElement(By.className("icon_facebook")).click();
	       driver.get("https://www.kodnest.com/");
	       WebElement registerDemoButton = driver.findElement(By.xpath("//span[text()='Register for Demo']"));
	       registerDemoButton.click();
	       //System.out.println(facebookLink);
	}

}

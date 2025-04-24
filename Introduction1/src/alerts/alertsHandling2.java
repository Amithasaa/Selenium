package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsHandling2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(3000);
        driver.findElement(By.id("alertNox")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("confirmBox")).click();
        Alert confirmBox = driver.switchTo().alert();
        confirmBox.dismiss();
	}

}

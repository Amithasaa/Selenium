package BrowserNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.get("https://www.amazon.in/ref=nav_logo");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("Title after back action: " + driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().forward(); //should go to amazon again
        System.out.println("Title after forward action: " + driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Same page reloaded");
        driver.quit();
	}

}

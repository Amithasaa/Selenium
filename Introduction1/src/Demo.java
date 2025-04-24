import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Demo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
       WebDriver driver = new EdgeDriver();
       Scanner scan = new Scanner(System.in);
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/ref=nav_logo");
       Thread.sleep(2000);
      //driver.navigate().to("https://www.google.com/");
       // get and navigate are same but prefer get method always
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
       System.out.println(driver.getWindowHandle());
     //System.out.println(driver.getWindowHandles());
       System.out.println(driver.getPageSource());
       scan.close();
	}

}

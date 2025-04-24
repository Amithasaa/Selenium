package browserAutomation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MaximizeMinimizeDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
	       Scanner scan = new Scanner(System.in);
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/ref=nav_logo");
	       Thread.sleep(2000);
	       driver.manage().window().minimize();
	       
	       //driver.manage().window().fullscreen();
	       System.out.println(driver.manage().window().getSize()); //(1050,700) 1050 is width and 700 is height of window
	       scan.close();
	}

}

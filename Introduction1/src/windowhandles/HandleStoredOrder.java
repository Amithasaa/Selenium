package windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleStoredOrder {

			public static void main(String[] args) throws InterruptedException {
				 WebDriver driver = new ChromeDriver();
				
				 driver.get("https://www.globalsqa.com/");
				 driver.findElement(By.linkText("pinterest")).click();
				 System.out.println(driver.getWindowHandles());
				 Thread.sleep(3000);	
				 
				 System.out.println(driver.getCurrentUrl());
				 driver.findElement(By.linkText("twitter")).click();
				 System.out.println(driver.getWindowHandles());
				 Thread.sleep(3000);	
				 
				 System.out.println(driver.getCurrentUrl());
				 driver.findElement(By.linkText("linkedin")).click();
				 System.out.println(driver.getWindowHandles());
				 Thread.sleep(3000);	
				 
				 System.out.println(driver.getCurrentUrl());
				 driver.findElement(By.linkText("google")).click();
				 System.out.println(driver.getWindowHandles());
				 Thread.sleep(3000);	
				 
				 System.out.println(driver.getCurrentUrl());
				 driver.findElement(By.linkText("facebook")).click();
				 System.out.println(driver.getWindowHandles());
				 Thread.sleep(3000);	
				 
				 Set<String> allHandles = driver.getWindowHandles();
				 System.out.println(allHandles);
				 System.out.println(allHandles.size());
				 Iterator<String> itr = allHandles.iterator();
				 String mainWindow = itr.next();
				 String pinterestWindow = itr.next();
				 String twitterWindow = itr.next();
				 String LinkedInWindow = itr.next();
				 String googleWindow = itr.next();
				 String facebookWindow = itr.next();
				 
				 System.out.println("Main window handle:" + mainWindow);
				 System.out.println("Pinterest window handle:" + pinterestWindow);
				 System.out.println("Twitter window handle:" + twitterWindow);
				 System.out.println("LinkedIn window handle:" + LinkedInWindow);
				 System.out.println("Google window handle: " + googleWindow);
				 System.out.println("Facebook window handle:" + facebookWindow);
				 
				 driver.switchTo().window(facebookWindow);
				 driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			        Thread.sleep(3000);
			        WebElement courseDropdown = driver.findElement(By.id("course"));
			        Select dropdown = new Select(courseDropdown);
			        Thread.sleep(3000);
			        dropdown.selectByIndex(2);
			        Thread.sleep(3000);
			        String selectedCourse1 = dropdown.getFirstSelectedOption().getText();
			        System.out.println("Selected course by index: " + selectedCourse1);
			        
			        Thread.sleep(3000);
			        dropdown.selectByValue("java");
			        Thread.sleep(3000);
			        String selectedCourse2 = dropdown.getFirstSelectedOption().getText();
			        System.out.println("Selected course by value: " + selectedCourse2);
				 
			 }
		 }



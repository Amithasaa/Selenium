package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillingForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        WebElement firstName = driver.findElement(By.xpath("//input[@maxlength=\"10\"][@name = \"name\"]"));
        firstName.sendKeys("Amitha");
        WebElement lastName = driver.findElement(By.xpath("//input[@maxlength=\"15\"][@name = \"name\"]"));
        lastName.sendKeys("S A");	
        
        //email
        driver.findElement(By.xpath("//input[@type=\"text\"][@required]")).sendKeys("amithasa22@gmail.com");
        //password
        driver.findElement(By.xpath("//div[@class='container']/div/input[@type=\"password\"]")).sendKeys("amithasa12");
        //repeat password
        driver.findElement(By.xpath("//input[@maxlength=\"15\"][@name=\"name\"]/following-sibling::input[@type=\"password\"]")).sendKeys("amithasa12");
        //register
        driver.findElement(By.xpath("//button[@class = 'btn'][text() = 'Register']")).click();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        }

}

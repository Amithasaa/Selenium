package browserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kodnest.com");
		WebElement youTubeIcon = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/KodNest']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView()", youTubeIcon);
		js.executeScript("arguments[0].click()", youTubeIcon);
		//youTubeIcon.click();
	}

}

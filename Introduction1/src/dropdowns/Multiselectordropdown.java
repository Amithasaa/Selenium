package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectordropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement idedropdown = driver.findElement(By.id("ide"));
        Select multidropdown = new Select(idedropdown);
        if (multidropdown.isMultiple()) {
        System.out.println("Dropdown is multi-select");
        multidropdown.selectByIndex(0);
        Thread.sleep(2000);
        multidropdown.selectByValue("ij");
        Thread.sleep(2000);
        multidropdown.selectByVisibleText("Visual Studio");
        Thread.sleep(2000);
        List<WebElement> selectedOptions = multidropdown.getAllSelectedOptions();
        System.out.println(selectedOptions);
        System.out.println("Selected IDEs");
        for (WebElement option : selectedOptions) {
        	System.out.print(option.getText()+ ", "); 
        }
       }
//        multidropdown.deselectByIndex(0);
//        Thread.sleep(2000);
//        multidropdown.deselectByValue("ij");
//        Thread.sleep(2000);
//        multidropdown.deselectByVisibleText("Visual Studio");
//        Thread.sleep(2000);
        //multidropdown.deselectAll();
	}

}

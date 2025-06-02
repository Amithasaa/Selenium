import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class resizableonly {

    @Test
    public void resizable() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");

        // Switch to the frame
        WebElement fram = driver.findElement(By.cssSelector(".demo-frame"));
        driver.switchTo().frame(fram);

        // Locate the resizable handle
        WebElement resizeHandle = driver.findElement(By.cssSelector(".ui-resizable-se"));

        // Perform the resize action
        Actions act = new Actions(driver);
        act.clickAndHold(resizeHandle).moveByOffset(100, 50).release().perform();

        driver.switchTo().defaultContent();
    }
}

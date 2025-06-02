import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Practice {
	@Test(description = "Successfully entered youtube")
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));		
		driver.get("https://app.kodnest.in/login");
		WebElement search = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div[2]/form/div/div[2]/input"));		
		search.sendKeys("amitha@gmail.com");
	}
}
//	WebDriver driver;
//
//	public Practice(WebDriver driver) {
//		
//		this.driver = driver;
//	}
//	By emailinput = By.id("email-input");
//	By passwordinput = By.id("password-input");
//	By loginButton = By.id("login-submit-button");
//	By emailRequiredError = By.xpath("//p[@id='email-error' and text()='Email is required']");
//	By passwordRequiredError = By.xpath("//p[@id='password-error' and text()='Please enter your password']");
//	By invalidEmailFormatError = By.xpath("//p[@id='email-error' and text()='Invalid email format']");
//	By userNotFoundError = By.xpath("//div[@data-title='' and text()='User not found with this email address']");
//	By incorrectCredentialsError = By.xpath("//div[@data-title='' and text()='Incorrect Credentials']");
//	
//	public void enterPassword(String password) {
//		WebElement passwordField = driver.findElement(passwordinput);
//		passwordField.clear();
//		passwordField.sendKeys(password);
//	}
//	
//	public void clickLoginbutton() {
//		driver.findElement(loginButton).click();
//	}
//
//	public String getEmailRequiredError() {
//		return driver.findElement(emailRequiredError).getText();
//	}
//	
//	public String getPasswordRequiredError() {
//		return driver.findElement(passwordRequiredError).getText();
//	}
//	
//	public String getInvalidEmailFormatError() {
//		return driver.findElement(invalidEmailFormatError).getText();
//	}
//	
//	public String getUserNotFoundError() {
//		return driver.findElement(userNotFoundError).getText();
//	}
//	
//	public String getIncorrectCredentialsError() {
//		return driver.findElement(incorrectCredentialsError).getText();
//	}
//}
	
		// TODO Auto-generated method stub
//      WebDriver driver = new ChromeDriver();
//      driver.get("https://www.google.com/");
//      driver.manage().window().maximize();
//      System.out.println(driver.getTitle());
//      String url = driver.getCurrentUrl();
//      System.out.println(url);
////      String res = driver.getPageSource();
////      System.out.println(res);
//      Thread.sleep(3000);
//      driver.get("https://www.google.com/");
//      Set<String> handle = driver.getWindowHandles();
//      System.out.println(handle);
//      driver.manage().window().getSize();
//      driver.manage().window().minimize();
//      driver.navigate().back();
//      Thread.sleep(2000);;
		
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://app.kodnest.in/login");	
//		WebElement el = driver.findElement(By.id("email-input"));
//		el.sendKeys("amitha@gmail.com");
//		WebElement pa = driver.findElement(By.id("password-input"));
//		pa.sendKeys("amitha");
//		WebElement lo = driver.findElement(By.id("login-submit-button"));
//		lo.click();
		
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://app.kodnest.in/login");	
//		WebElement el = driver.findElement(By.name("email"));
//		el.sendKeys("amithaamitha290@gmail.com");
//		WebElement pa = driver.findElement(By.name("password"));
//		pa.sendKeys("Amitha@1234");
//		WebElement lo = driver.findElement(By.id("login-submit-button"));
//		lo.click();
//		String name = lo.getTagName();
//		System.out.println(name);
//		System.out.println(lo.getSize());
		
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		WebElement bs = driver.findElement(By.linkText("Bestsellers"));
//		WebElement bs = driver.findElement(By.partialLinkText("Sellers"));
//		bs.click();
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.globalsqa.com/");
//		WebElement fb = driver.findElement(By.linkText("facebook"));
//		WebElement g = driver.findElement(By.linkText("google"));
//		WebElement li = driver.findElement(By.linkText("linkedin"));
//		WebElement t = driver.findElement(By.linkText("twitter"));
//		WebElement p = driver.findElement(By.linkText("pinterest"));
//		
//		System.out.println("Text: " + fb.getText());
//		fb.click();
//		
//		System.out.println("Text: " + g.getText());
//		g.click();
//		
//		System.out.println("Text: " + li.getText());
//		li.click();
//		
//		System.out.println("Text: " + t.getText());
//		t.click();
//		
//		System.out.println("Text: " + p.getText());
//		p.click();
//		
//		Set<String> handle = driver.getWindowHandles();
//		System.out.println(handle);
//		System.out.println(handle.size());
		
		
		
		
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.globalsqa.com/");
//		WebElement fb = driver.findElement(By.className("header_soc_facebook"));
//		WebElement g = driver.findElement(By.className("header_soc_google"));
//		WebElement li = driver.findElement(By.className("header_soc_linkedin"));
//		WebElement t = driver.findElement(By.className("header_soc_twitter"));
//		WebElement p = driver.findElement(By.className("header_soc_pinterest"));
//		
//		System.out.println("Text: " + fb.getText());
//		fb.click();
//		
//		System.out.println("Text: " + g.getText());
//		g.click();
//		
//		System.out.println("Text: " + li.getText());
//		li.click();
//		
//		System.out.println("Text: " + t.getText());
//		t.click();
//		
//		System.out.println("Text: " + p.getText());
//		p.click();
//		
//		Set<String> handle = driver.getWindowHandles();
//		System.out.println(handle);
//		System.out.println(handle.size());
//		
//		driver.quit();
		
		
//
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://app.kodnest.in/login");
//		WebElement css = driver.findElement(By.cssSelector("input[id-'email-input']"));
//		css.click();
		
		//Handling alerts
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		Thread.sleep(2000);
//		WebElement ab = driver.findElement(By.id("promptBox"));
//		ab.click();
//		Thread.sleep(2000);
//		Alert albox = driver.switchTo().alert();
//		albox.sendKeys("Amitha");
//		Thread.sleep(2000);
//		albox.accept();
//		Thread.sleep(2000); // Clicks OK
//		
//		albox.dismiss(); // Clicks cancel
//		driver.quit();
		
		
		
		//Handling static drop downs
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		Thread.sleep(2000);
//		
//		WebElement se = driver.findElement(By.id("course"));
//		Select dropdown = new Select(se);
//		Thread.sleep(2000);
//		dropdown.selectByIndex(1);
//		Thread.sleep(2000);
//		
//		String name = dropdown.getFirstSelectedOption().getText();
//		System.out.println("Selected by index is: " + name);
//		Thread.sleep(2000);
//		
//		dropdown.selectByValue("python");
//		String name1 = dropdown.getFirstSelectedOption().getText();
//		System.out.println("Selected value is: " + name1);
//		Thread.sleep(2000);
//		
//		dropdown.selectByVisibleText("Javascript");
//		String name2 = dropdown.getFirstSelectedOption().getText();
//		System.out.println("Selected by visible text is: " + name2);
//		driver.quit();
		
		
		//Handling multi-select drop downs
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		Thread.sleep(2000);
//		
//		WebElement op = driver.findElement(By.id("ide"));
//		Select dropdown = new Select(op);
//		if (dropdown.isMultiple()) {
//			System.out.println("Yes, it supports multiple dropdown");
//			
//			dropdown.selectByIndex(1);
//			Thread.sleep(2000);
//			
//			dropdown.selectByValue("vs");
//			Thread.sleep(2000);
//			
//			dropdown.selectByVisibleText("NetBeans");
//			Thread.sleep(2000);
//			
//			List<WebElement> selected = dropdown.getAllSelectedOptions();
//			System.out.println("Selected IDE's: ");
//			for (WebElement option : selected) {
//				System.out.println(option.getText());
//			}
//			
//			Thread.sleep(2000);
//			dropdown.deselectByIndex(1);
//			System.out.println("Deselected IntelJ from dropdown");
//			
//			Thread.sleep(2000);
//			dropdown.deselectByValue("vs");
//			System.out.println("Deselected VS from dropdown");
//			
//			Thread.sleep(2000);
//			dropdown.deselectByVisibleText("NetBeans");
//			System.out.println("Deselected NetBeans from dropdown");
//			
//			for (WebElement opt : dropdown.getOptions()) {
//				dropdown.selectByVisibleText(opt.getText());
//				Thread.sleep(2000);
//			}
//			System.out.println("All options selected");
//			Thread.sleep(2000);
//			
//			dropdown.deselectAll();
//			System.out.println("All options deselected");
//			Thread.sleep(1000);
//		} else {
//			System.out.println("It does not support multi drop down");
//		}

		
		//Handling auto-suggestive drop downs
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.globalsqa.com/demo-site/auto-complete/#ComboBox");
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the text to select");
//		String text = sc.next();
//		
//		System.out.println("Enter the expected text");
//		String expected = sc.next();
//		
//		WebElement we = driver.findElement(By.className("custom-combobox-input"));
//		we.clear();
//		
//		we.sendKeys(text);
//		Thread.sleep(2000);
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.globalsqa.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.className("header_soc_facebook")).click();
//		driver.getWindowHandles();
//		Thread.sleep(2000);
//		driver.findElement(By.className("header_soc_google")).click();
//		driver.getWindowHandles();
//		Thread.sleep(2000);
//		driver.findElement(By.className("header_soc_linkedin")).click();
//		driver.getWindowHandles();
//		Thread.sleep(2000);
//		driver.findElement(By.className("header_soc_twitter")).click();
//		driver.getWindowHandles();
//		Thread.sleep(2000);
//		driver.findElement(By.className("header_soc_pinterest")).click();
//		driver.getWindowHandles();
//		Thread.sleep(2000);
//		
//		Set<String> wh = driver.getWindowHandles();
//		System.out.println(wh);
//		
//		for (String handle : wh) {
//			System.out.println(handle);
//			driver.switchTo().window(handle);
//			System.out.println(driver.getTitle());
//		}
		
		//drop
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();	
//		driver.get("https://jqueryui.com/droppable/");
//		
//		WebElement iframeElememt = driver.findElement(By.className("demo-frame"));
//		driver.switchTo().frame(iframeElememt);
//		WebElement dr = driver.findElement(By.id("draggable"));
//		WebElement dp = driver.findElement(By.id("droppable"));
//		
//		Actions actions = new Actions(driver);
//		actions.dragAndDrop(dr, dp).perform();
//		
//		driver.switchTo().defaultContent();
		
		
		//drag
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/draggable/");
//		
//		WebElement iframe = driver.findElement(By.className("demo-frame"));
//		driver.switchTo().frame(iframe);
//		
//		WebElement draggable = driver.findElement(By.id("draggable"));
//		
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(draggable, 100, 50).perform();
//		
//		driver.switchTo().defaultContent();
		
		
		//re sizable
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/resizable/");
//		
//		WebElement iframe = driver.findElement(By.className("demo-frame"));
//		driver.switchTo().frame(iframe);
//		
//		WebElement resize = driver.findElement(By.id("resizable"));
//		WebElement resizeHandle = driver.findElement(By.className("ui-resizable-se"));
//		
//		Actions action = new Actions(driver);
//		action.clickAndHold(resizeHandle).moveByOffset(50, 50).release().perform();
//		
//		driver.switchTo().defaultContent();
		
		
		// selectable
//		public Practice() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/selectable/");
//		
//		WebElement ifarme = driver.findElement(By.className("demo-frame"));
//		driver.switchTo().frame(ifarme);
//		
//		List<WebElement> selectable = driver.findElements(By.cssSelector("#selectable li"));
//		
//		Actions action = new Actions(driver);
//		action.keyDown(Keys.CONTROL)
//					.click(selectable.get(0))
//					.click(selectable.get(2))
//					.click(selectable.get(4))
//					.keyUp(Keys.CONTROL)
//					.perform();
//		
//		driver.switchTo().defaultContent();
//	}
//
//}
//
//

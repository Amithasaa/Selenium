package locatorspractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MultipleTabs2 {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 SocialMediaLinksPage socialMediaPage = new SocialMediaLinksPage(driver);
		 driver.get("https://www.globalsqa.com/");
		 String homePageTitle = driver.getTitle();
		 System.out.println(driver.getTitle());
		 
		 socialMediaPage.clickPinterest();
		 
		 socialMediaPage.clickTwitter();

		 socialMediaPage.clickLikedinLink();		

		 socialMediaPage.clickGoogleLink();
		
		 socialMediaPage.clickFacebookLink();
		 
//		 Assert.assertTrue(false);
		 Assert.assertFalse(false);
		 Assert.assertEquals(homePageTitle,"Home = GlobalSQA");
		 
		 Set<String> allHandles = driver.getWindowHandles();
		 System.out.println(allHandles);
	}

}

package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialMediaLinksPage {
	WebDriver driver;

	public SocialMediaLinksPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver,this);
	}
	By pinterestLocator = By.className("header_soc_pinterest");
	By twitterLocator = By.className("header_soc_twitter");
	
	public void clickPinterest() {
		driver.findElement(pinterestLocator).click();
	}
	
	public void clickTwitter() {
		driver.findElement(twitterLocator).click();
	}
	
	@FindBy (className = "header_soc_linkedin")
	WebElement linkedInLink;
	public void clickLikedinLink() {
		linkedInLink.click();
	}
		
	@FindBy (className = "header_soc_google")
	WebElement googleLink;
	public void clickGoogleLink() {
		googleLink.click();
	}
	
	@FindBy (className = "header_soc_facebook")
	WebElement facebookLink;
	public void clickFacebookLink() {
		facebookLink.click();
	}
	
//	WebElement linkedinLink = driver.findElement(By.className("icon_linkedin")); 
//	WebElement googleLink = driver.findElement(By.className("icon_google")); 
//	WebElement facebookLink = driver.findElement(By.className("icon_facebook"));
	 
	 
	 
}



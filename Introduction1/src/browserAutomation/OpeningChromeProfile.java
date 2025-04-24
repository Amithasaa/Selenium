package browserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpeningChromeProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userDirPath = "C:\\Users\\Amitha S A\\AppData\\Local\\Google\\Chrome\\User Data";
		String profiledir = "Profile 5";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data=" + userDirPath);
		options.addArguments("profile-directory=" + profiledir);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
	}

}

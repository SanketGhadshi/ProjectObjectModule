package JavaTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3_Baseclass {
		
   public static  WebDriver driver;

	@BeforeSuite
	public void initalization() {
			
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver=new ChromeDriver(options);
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
	}

	@AfterSuite
	public void closing() {
		
//		driver.close();
	
}
}

package Azurewebsites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlSetUp {

	   public static  WebDriver driver;

		@BeforeSuite
		public void initalization() {
			
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(options);		
		    driver.manage().window().maximize();
		    driver.get("https://itera-qa.azurewebsites.net/home/automation");
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}

//		@AfterSuite
//		public void closing() throws InterruptedException {
//			Thread.sleep(3000);
//			driver.close();
		
	//}

}

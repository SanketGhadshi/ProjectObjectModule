package JavaPageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

public class LoginPageClass {
	
	public static WebDriver driver;
	
	@FindBy (xpath="//input[@id='modalusername']")     //declaration
	private WebElement email;
	
	@FindBy (xpath="//input[@id='current-password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@class='_1VfsI _OD95i _3_H0V']")
	private WebElement button;
	
	@FindBy (xpath="//a[text()='Forgot password?']")
	private WebElement forgotpass;
		
    public LoginPageClass(WebDriver driver){     //initalization		
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}   
    public void getTitle() {    	
    	String actual="Log in - W3Schools";
    	String Expected=driver.getTitle();
  //  	Assert.assertEquals(actual, Expected);    	
    }    
    public void entercred() {
    	email.sendKeys("shubhamshedge810@gmail.com");
    	password.sendKeys("AdminShubham@123");
    }
    public void btnClick() {
    	button.click();	
    } 
    public void forgotpass() {  	
    	forgotpass.click();	
    }
}

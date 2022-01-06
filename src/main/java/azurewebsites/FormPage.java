package azurewebsites;

import org.jsoup.select.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

	public static WebDriver driver;
	
	@FindBy (id="name")
	private WebElement Name;
	
	@FindBy (id="phone")
	private WebElement MobileNo;
	
	@FindBy (id="email")
	private WebElement email;
	
	@FindBy (id="password")
	private WebElement password;
	
	@FindBy (id="address")
	private WebElement address;
	
	@FindBy (name="submit")
	private WebElement subbutton;
	
	@FindBy (xpath="//label[@class=\"form-check-label\"]")
	private WebElement GenderRadioBtn;
	
	@FindBy (xpath="//label[@class=\"form-check-label\"]")
	private WebElement daycheckbox;
	
	@FindBy (xpath=("//select[@class='custom-select']"))
	private By DropDown;
	
	@FindBy (xpath="//label[@class=\"custom-control-label\"]")
	private WebElement YearRadioBtn;
	
	@FindBy  (xpath="//div[@class=\"custom-control custom-checkbox\"]")
	private WebElement Checkbox2;
	
	  public FormPage(WebDriver driver){     //initalization		
			this.driver=driver;
			PageFactory.initElements(driver, this);		
	  }
	  
	  public static WebElement getElement(By Locator) {
		  return driver.findElement(Locator);
	  }
	public static void doSelectByIndex(By Locator,int value) {
		  Select select =new Select(getElement(Locator));
		  select.selectByIndex(value);
	  }
	  
	  public void FillInfo() {
		  Name.sendKeys("Test Engineer");
		  MobileNo.sendKeys("1234567890");
		  email.sendKeys("admin@gmail.com");
		  password.sendKeys("admin@123");
		  address.sendKeys("Pune");
		  subbutton.click();
	  }
          public void DropDown() {
            	
        	  doSelectByIndex(DropDown,2);
       
	    }
	  public void Gender() {
		  
	  }
}

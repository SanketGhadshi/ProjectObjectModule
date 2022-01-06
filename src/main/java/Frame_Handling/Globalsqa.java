package Frame_Handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Globalsqa {

	public static WebDriver driver;
	
	@FindBy(xpath="//iframe[@name='globalSqa']")
	private WebElement Frame4;
	
	@FindBy(id="current_filter")
	private WebElement DD_ALL;
	
	@FindBy(id="s")
	private WebElement searchbox;
	
	public Globalsqa(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public void switchToframe() {
		driver.switchTo().frame(Frame4);
	}
	public void Handle_DD(){
		Actions action=new Actions(driver);
		action.click(DD_ALL).sendKeys("SOFTWARE TESTING").click().build().perform();
	}
	public void searchbox() throws InterruptedException{
		searchbox.clear();
		searchbox.click();
		searchbox.sendKeys("software Testing");
		Thread.sleep(5000);
	}
}

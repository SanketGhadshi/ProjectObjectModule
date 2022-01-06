package JavaTestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import JavaPageclass.LoginPageClass;

public class LoginTestClass extends W3_Baseclass {
	@Test(priority=2)
	public void Login() {
		LoginPageClass lp=new LoginPageClass(driver);
		lp.entercred();
		lp.btnClick();		
	}	
	@Test(priority=1)
	public void getTitle() {
		 LoginPageClass lp=new LoginPageClass(driver);
		lp.getTitle();		
	}	
	@Test(priority=3)
	public void forpass() {
		 LoginPageClass lp=new LoginPageClass(driver);
		lp.forgotpass();	
	}
	
}


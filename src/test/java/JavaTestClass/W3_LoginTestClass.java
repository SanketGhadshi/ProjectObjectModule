package JavaTestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import JavaPageclass.LoginPageClass;
import JavaPageclass.W3_LoginPageClass;

public class W3_LoginTestClass extends W3_Baseclass {

	 W3_LoginPageClass w3=new W3_LoginPageClass(driver);
	
	@Test(priority=2)
	public void Login() {
		w3.entercred();
		w3.btnClick();	
	}	
	@Test(priority=1)
	public void getTitle() {
		w3.getTitle();
	}
	
	@Test(priority=3)
	public void forpass() {
		w3.forgotpass();		
	}
	
}


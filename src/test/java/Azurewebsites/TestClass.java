package Azurewebsites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BrowserSetUp.BaseTest;
import azurewebsites.FormPage;

public class TestClass extends UrlSetUp {
	
  @Test
  public void fillinfo() {
	  FormPage obj=new FormPage(driver);
	  obj.FillInfo();
  }
  @Test
  public void DropDown() {
	  FormPage obj=new FormPage(driver);
	  obj.DropDown();;
  }
}

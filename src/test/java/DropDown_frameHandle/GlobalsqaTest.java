package DropDown_frameHandle;

import org.testng.annotations.Test;

import BrowserSetUp.BaseTest;
import Frame_Handling.Globalsqa;

public class GlobalsqaTest extends BaseTest {
  @Test(priority = 1)
  public void url() {
	  driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
  }
  @Test(priority = 2)
  public void SwiToframe() {
	  Globalsqa obj=new Globalsqa(driver);
	  obj.switchToframe();
  }
  @Test(priority = 4)
  public void HandleDD() {
	  Globalsqa obj=new Globalsqa(driver);
	  obj.Handle_DD();
  }
  @Test(priority = 3)
  public void searchbox() throws InterruptedException {
	  Globalsqa obj=new Globalsqa(driver);
	  obj.searchbox();
  }
}

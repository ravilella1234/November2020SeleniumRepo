package pageobjectmodel;

import org.testng.annotations.Test;

import com.project.December2020MavenBuild.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM_001 extends BaseTest
{
	Login obj;
	CustomerRegistrationPage reg;
	
  @BeforeMethod
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  {
	  init();
	  launch(bType);
	  navigateUrl("automationurl");
  }
  
  @Test(enabled = false)
  public void login() 
  {
	  obj = new Login(driver);
	  obj.customerLogin();
	  Assert.assertEquals(obj.customerVerification(), "Authentication failed.");
  }
  
  @Test
  public void registration() throws Exception
  {
	  reg = new CustomerRegistrationPage(driver);
	  reg.customerRegistration();
  }

  @AfterMethod
  public void endProcess()
  {
	  //browserClose();
  }

}

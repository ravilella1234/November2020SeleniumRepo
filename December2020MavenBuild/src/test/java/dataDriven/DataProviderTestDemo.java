package dataDriven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderTestDemo 
{
	
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("iam beforeMethod...");
  }
  
  @DataProvider
  public Object[][] dp() {
	  System.out.println("iam dataProvider...");
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) 
  {
	  System.out.println("iam testMethod...");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("iam afterMethod...");
  }


  
}

package com.crm.SalesforceCRM.suitea;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.SalesforceCRM.BaseClass.BaseTest;

public class LoginTest extends BaseTest
{
 
  @Test(dataProvider = "getData")
  public void f() 
  {
	  System.out.println("iam f Method");
  }
  
  @DataProvider
  public Object[][] getData()
  {
	  System.out.println("iam Dataprovider....");
	  
	return null;
	  
  }

 

}

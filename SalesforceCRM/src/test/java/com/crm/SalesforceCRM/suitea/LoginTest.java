package com.crm.SalesforceCRM.suitea;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.SalesforceCRM.BaseClass.BaseTest;
import com.crm.SalesforceCRM.utils.DataUtils;

public class LoginTest extends BaseTest
{
 
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> td) 
  {
	  if(td.get("RunMode").equals("N"))
		  throw new SkipException("Runmode is set as No...");
	  
	  System.out.println("iam f Method");
	  ds.executeKeywords(xls, testName, td);
  }
  
	
  @DataProvider() 
  public Object[][] getData() 
  {
	  System.out.println("iam Dataprovider....");
	  sheetName = "Data";
	  
	  return DataUtils.getTestData(xls, sheetName, testName);  
  }
}

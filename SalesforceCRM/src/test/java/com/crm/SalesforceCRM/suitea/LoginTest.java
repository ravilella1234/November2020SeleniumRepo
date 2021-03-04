package com.crm.SalesforceCRM.suitea;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.crm.SalesforceCRM.BaseClass.BaseTest;

public class LoginTest extends BaseTest
{
 
  @Test
  public void f() 
  {
	  System.out.println("iam f Method");
  }

  @AfterMethod
  public void End() 
  {
	  System.out.println("iam afterMethod");
  }

}

package com.crm.SalesforceCRM.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.SalesforceCRM.Driver.utils.ExcelAPI;

public class BaseTest 
{
	
	public static String projectPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties data;
	public static Properties mainProp;
	public static Properties childProp;
	public static ExcelAPI xls;
	
	public void init() throws Exception
	{
		fis = new FileInputStream(projectPath+"//DataSources//commondata.properties");
		data = new Properties();
		data.load(fis);
		
		fis = new FileInputStream(projectPath+"//DataSources//environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath+"//DataSources//"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		String weburl = childProp.getProperty("zohourl");
		System.out.println(weburl);
			
		//How do i come to know the suite?
		String[] pack = this.getClass().getPackage().getName().split("\\.");
		String suiteName = pack[pack.length-1];
		System.out.println(suiteName);
		
		//init the XLS Files
		xls = new ExcelAPI(childProp.getProperty(suiteName+"_xls"));
		
		//init testName
		String testName = this.getClass().getSimpleName();
		System.out.println(testName);
	}
	
	
	@BeforeMethod
	public void startUp() throws Exception
	{
	  System.out.println("iam beforeMethod");
	  init();
	}
	
	 @AfterMethod
	  public void End() 
	  {
		  System.out.println("iam afterMethod");
	  }
	

}

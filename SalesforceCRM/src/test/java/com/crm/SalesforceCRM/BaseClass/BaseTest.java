package com.crm.SalesforceCRM.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.crm.SalesforceCRM.driverclass.DriverScript;
import com.crm.SalesforceCRM.utils.ExcelAPI;

public class BaseTest 
{
	
	public static String projectPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties data;
	public static Properties mainProp;
	public static Properties childProp;
	public  Properties orProp;
	public static ExcelAPI xls;
	public static String testName ;
	public static String sheetName;
	public DriverScript ds=null;
	
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
		
		fis = new FileInputStream(projectPath+"//DataSources//or.properties");
		orProp = new Properties();
		orProp.load(fis);
			
		//How do i come to know the suite?
		String[] pack = this.getClass().getPackage().getName().split("\\.");
		String suiteName = pack[pack.length-1];
		System.out.println(suiteName);
		
		//init testName
		testName = this.getClass().getSimpleName();
		System.out.println(testName);
		
		//init the XLS Files
		xls = new ExcelAPI(childProp.getProperty(suiteName+"_xls"));	
		
		ds = new DriverScript();
		ds.setOrProp(orProp);
	}
	
	
	@BeforeTest
	public void startUp() throws Exception
	{
	  System.out.println("iam beforeTest");
	  init();
	}
	
	 @AfterTest
	  public void quit() 
	  {
		  System.out.println("iam afterTest");
		  if(ds!=null)
			  ds.quit();
	  }
	

}

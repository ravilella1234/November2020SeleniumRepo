package com.crm.SalesforceCRM.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	
	public static String projectPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties data;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
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
	}
	
	
	@BeforeMethod
	public void startUp() throws Exception
	{
	  System.out.println("iam beforeMethod");
	  init();
	}
	
	

}

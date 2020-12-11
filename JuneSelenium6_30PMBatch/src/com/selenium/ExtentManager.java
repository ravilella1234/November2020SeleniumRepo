package com.selenium;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{
	public static ExtentReports extent;
	
	public static ExtentReports getInstance()
	{
		if(extent==null)
		{
			Date dt =  new Date();
			String reportFilePath = dt.toString().replace(':', '_').replace(' ', '_')+".html";
			extent = new ExtentReports(projectPath + "//HTMLReports//" + reportFilePath);
			extent.loadConfig(new File(projectPath + "extentreportconfig.xml"));
			extent.addSystemInfo("Selenium Launguage", "3.141.59").addSystemInfo("Instance", parentInstance.getProperty("env"));
		}
		
		
		return extent;
		
	}

}

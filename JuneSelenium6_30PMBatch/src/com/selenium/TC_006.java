package com.selenium;

import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest
{
	
	
	public static void main(String[] args) throws Exception 
	{
		
		init();
		test = report.startTest("TC_006");
		test.log(LogStatus.INFO, "Initilizing Properties files....");
		
		launchBrowser("chromebrowser");
		test.log(LogStatus.PASS, "Launched the browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.FAIL, "Navigated to url : - " + childInstance.getProperty("amazonurl"));
				
		selectOption("amazondropbox_id","Books");
		test.log(LogStatus.PASS, "Selected the option Books by using the locator :- " + orProp.getProperty("amazondropbox_id"));
				
		typeText("amzonsearchtext_id","Harry potter");
		test.log(LogStatus.PASS, "Entered the text Harry potter by using the locator :- " + orProp.getProperty("amzonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on Search Button by using the locator : - " + orProp.getProperty("amazonsearchbutton_xpath"));
				
		report.endTest(test);
		report.flush();
		
	}

	
}

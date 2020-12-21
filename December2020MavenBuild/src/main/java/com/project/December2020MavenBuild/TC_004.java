package com.project.December2020MavenBuild;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{

		
	public static void main(String[] args) throws Exception 
	{
		
		
		init();
		test = report.startTest("TC_004");
		test.log(LogStatus.INFO, "----------------   Started TC_004 ------------------------");
		test.log(LogStatus.INFO, "initialising the dependency files...... ");
				
		launch("firefoxbrowser");
		test.log(LogStatus.PASS, "Opening the browser :-" + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to :- " + childProp.getProperty("amazonurl"));
			
		selectOption("amazondropdown_id","Books");
		test.log(LogStatus.FAIL, "Selected the option books by using the locator :- "+ orProp.getProperty("amazondropdown_id"));
		
		type("amazonsearchtext_name","Harry Potter");
		test.log(LogStatus.INFO, "Entered the test Harry Potter by using locator :- " + orProp.getProperty("amazonsearchtext_name"));
	
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.ERROR, "Clicked on search button by using locator :- " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		test.log(LogStatus.INFO, "----------------   Ended TC_004 ------------------------");
		
		report.endTest(test);
		report.flush();
	}

	

}

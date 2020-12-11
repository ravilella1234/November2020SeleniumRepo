package com.verifications;

import com.relevantcodes.extentreports.LogStatus;
import com.selenium.BaseTest;

public class TC_10 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("TC_10");
		
		launchBrowser("chromebrowser");
		test.log(LogStatus.PASS, "Opened the browser : " +  p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childInstance.getProperty("amazonurl"));
		
		
		String expectedLink = "Customer Servic";

		if(!isElementEqual(expectedLink))
			reportFailure("Both links are not equal....");
		else
			reportSuccess("Both links are equal...");
		
		report.endTest(test);
		report.flush();
		
	}

	

	

}

package com.verifications;

import org.openqa.selenium.By;

import com.launchings.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest
{

		
	public static void main(String[] args) throws Exception 
	{
		
		init();
		test = report.startTest("TC_006");
		test.log(LogStatus.INFO, "----------------   Started TC_006 ------------------------");
		test.log(LogStatus.INFO, "initialising the dependency files...... ");
				
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Opening the browser :-" + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to :- " + childProp.getProperty("amazonurl"));
			
		//String actualLink = driver.findElement(By.linkText("New Releases")).getText();
		String actualLink = driver.findElement(By.linkText("New Releases")).getAttribute("innerHTML");
		String expectedLink = "Releases";
		
		System.out.println("Actual Link : " + actualLink);
		System.out.println("Exected Link : " + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		if(actualLink.contains(expectedLink))
			System.out.println("Both links are equal...");
		else
			System.out.println("Both links are not equal...!");
		
		
		
		
		test.log(LogStatus.INFO, "----------------   Ended TC_006 ------------------------");
		
		report.endTest(test);
		report.flush();
	}

	

}

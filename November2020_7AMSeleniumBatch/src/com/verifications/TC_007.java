package com.verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.launchings.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_007 extends BaseTest
{

		
	public static void main(String[] args) throws Exception 
	{
		
		init();
		test = report.startTest("TC_007");
		test.log(LogStatus.INFO, "----------------   Started TC_007 ------------------------");
		test.log(LogStatus.INFO, "initialising the dependency files...... ");
				
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Opening the browser :-" + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to :- " + childProp.getProperty("amazonurl"));
			
		String actualLink = driver.findElement(By.linkText("New Releases")).getText();
		String expectedLink = "Releases";
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));		
		loc.sendKeys("sony");
		String val = loc.getAttribute("value");
		System.out.println("Text is : " + val);
		
		test.log(LogStatus.INFO, "----------------   Ended TC_007 ------------------------");
		
		report.endTest(test);
		report.flush();
	}

	

}

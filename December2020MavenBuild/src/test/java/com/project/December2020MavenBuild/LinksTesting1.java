package com.project.December2020MavenBuild;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LinksTesting1 extends BaseTest
{

	@BeforeMethod
	public void setup() throws Exception
	{
		init();
		test = report.startTest("LinksTesting1");
		test.log(LogStatus.INFO, "----------------   Started LinksTesting1 ------------------------");
		test.log(LogStatus.INFO, "initialising the dependency files...... ");
				
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Opening the browser :-" + p.getProperty("chromebrowser"));
				
		navigateUrl("googleurl");
		test.log(LogStatus.INFO, "Navigated to :- " + childProp.getProperty("googleurl"));
		
	}
	
	
	@Test()
	public void linktesting1()
	
	 {
		String expval="???? ?????";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		System.out.println(actval);
		System.out.println(expval);
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod
	public void tearDown()
	{
		  report.endTest(test);
		  report.flush();
		  
		 // driver.quit();
	}

}

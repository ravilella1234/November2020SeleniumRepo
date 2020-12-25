package com.project.December2020MavenBuild;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
	

  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  {
	  System.out.println("StartProcess");
	  
	    init();
		test = report.startTest("TNG_002");
		test.log(LogStatus.INFO, "----------------   Started TNG_002 ------------------------");
		test.log(LogStatus.INFO, "initialising the dependency files...... ");
				
		launch(bType);
		test.log(LogStatus.PASS, "Opening the browser :-" + bType);
				
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to :- " + childProp.getProperty("amazonurl"));
	  
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	  System.out.println("Amazon Test");
	    selectOption("amazondropdown_id","Books");
		test.log(LogStatus.FAIL, "Selected the option books by using the locator :- "+ orProp.getProperty("amazondropdown_id"));
		
		type("amazonsearchtext_name","Harry Potter");
		test.log(LogStatus.INFO, "Entered the test Harry Potter by using locator :- " + orProp.getProperty("amazonsearchtext_name"));
	
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.ERROR, "Clicked on search button by using locator :- " + orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess() 
  {
	  System.out.println("EndProcess");
	  report.endTest(test);
	  report.flush();
	  
	  driver.quit();
	  
  }

}

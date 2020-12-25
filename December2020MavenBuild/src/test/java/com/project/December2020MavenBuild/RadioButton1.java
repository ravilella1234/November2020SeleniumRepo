package com.project.December2020MavenBuild;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class RadioButton1 extends BaseTest
{

	@BeforeMethod(groups = {"regression","smoke"})
	@Parameters("browser")
	  public void beforeMethod(String bType) throws Exception 
	  {
		init();
		test = report.startTest("RadioButton1");
		test.log(LogStatus.INFO, "----------------   Started RadioButton1 ------------------------");
		test.log(LogStatus.INFO, "initialising the dependency files...... ");
				
		launch(bType);
		test.log(LogStatus.PASS, "Opening the browser :-" + bType);
				
		navigateUrl("radiourl");
		test.log(LogStatus.INFO, "Navigated to :- " + childProp.getProperty("radiourl"));
	  }
	
	
	@Test(groups = {"regression","smoke"})
	public void radioButtonTest()
	{
		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group1"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 

  @AfterMethod(groups = {"regression","smoke"})
  public void afterMethod() 
  {
	  report.endTest(test);
	  report.flush();
	  
	  driver.quit();
  }
	
}

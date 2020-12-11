package com.verifications;

import org.openqa.selenium.By;

import com.selenium.BaseTest;

public class TC_007 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launchBrowser("chromebrowser");
		navigateUrl("amazonurl");
		
		boolean actualResult = driver.findElement(By.linkText("Customer Service")).isDisplayed();
		boolean expectResult = true;
		
		System.out.println("ActualResult : " + actualResult);
		System.out.println("ExpectedResult : " + expectResult);
		
		if(actualResult!=expectResult)
			System.out.println("Links is not visible");
		else
			System.out.println("Links are visible");
		
	}

}

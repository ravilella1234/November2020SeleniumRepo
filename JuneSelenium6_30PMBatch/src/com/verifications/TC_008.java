package com.verifications;

import org.openqa.selenium.By;

import com.selenium.BaseTest;

public class TC_008 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launchBrowser("chromebrowser");
		navigateUrl("amazonurl");
		
		//String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedLink = "Customer Ser";
		
		System.out.println("Actual Link : " + actualLink);
		System.out.println("Expected link : " + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		if(actualLink.contains(expectedLink))
			System.out.println("Both links are equal....");
		else
			System.out.println("Both links are not equal...");
	}

}

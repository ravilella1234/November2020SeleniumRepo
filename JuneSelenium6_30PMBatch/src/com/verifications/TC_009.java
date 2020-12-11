package com.verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.BaseTest;

public class TC_009 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launchBrowser("chromebrowser");
		navigateUrl("amazonurl");
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		
		loc.sendKeys("sony");
		
		String txt = loc.getAttribute("value");
		
		System.out.println("text is : " + txt);
		
	}

}

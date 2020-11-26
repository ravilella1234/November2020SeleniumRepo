package com.launchings;

import org.openqa.selenium.By;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		
		
		  String title = driver.getTitle(); System.out.println(title);
		  
		  String url = driver.getCurrentUrl(); System.out.println(url);
		  
		  driver.manage().deleteAllCookies();
		  
		  driver.navigate().back();
		  
		  Thread.sleep(4000);
		  
		  driver.navigate().forward();
		  
		  Thread.sleep(4000);
		  
		  driver.navigate().refresh();
		 
		
		//driver.close();
		
		
		
		driver.quit();
	}

}

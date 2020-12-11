package com.screenshots;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.selenium.BaseTest;

public class ScreenshotDemo2 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launchBrowser("chromebrowser");
		navigateUrl("googleurl");
		
		List<WebElement> links = driver.findElements(By.linkText("rajinikanth"));
		System.out.println(links.size());
		
		if(links.size()==0)
		{
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\google.jpeg"));
		}
		
		

	}

}

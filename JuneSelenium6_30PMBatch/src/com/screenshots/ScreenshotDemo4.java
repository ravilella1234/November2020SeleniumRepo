package com.screenshots;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.selenium.BaseTest;

public class ScreenshotDemo4 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launchBrowser("chromebrowser");
		navigateUrl("amazonurl");
		
		Date dt = new Date();
		String d = dt.toString().replace(':', '_').replace(' ', '_');
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\"+ d +".png"));

	}

}

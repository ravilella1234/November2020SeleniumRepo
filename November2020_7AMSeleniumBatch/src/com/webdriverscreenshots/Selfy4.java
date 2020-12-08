package com.webdriverscreenshots;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.launchings.BaseTest;

public class Selfy4 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		Date dt = new Date();
		System.out.println(dt);
		String str = dt.toString().replace(':', '_').replace(' ', '_');
		System.out.println(str);
		
		init();
		
		launch("chromebrowser");
		
		navigateUrl("googleurl");
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\screenshots\\"+str+".png"));
		
	}

}

package com.launchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunching 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/Desktop/UpdatedDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://bestbuy.com");
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/DELL/Desktop/UpdatedDrivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		
		//webdriver.ie.driver
		//webdriver.edge.driver

	}

}

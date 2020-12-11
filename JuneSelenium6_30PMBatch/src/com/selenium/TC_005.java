package com.selenium;

import org.apache.log4j.Logger;

public class TC_005 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_005.class);
	
	public static void main(String[] args) throws Exception 
	{
		
		init();
		log.info("Initilizing Properties files....");
		
		launchBrowser("chromebrowser");
		log.info("Launched the browser : - " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : - " + childInstance.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		log.info("Selected the option Books by using the locator :- " + orProp.getProperty("amazondropbox_id") );
				
		typeText("amzonsearchtext_id","Harry potter");
		log.info("Entered the text Harry potter by using the locator :- " + orProp.getProperty("amzonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Search Button by using the locator : - " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();

	}

	
}

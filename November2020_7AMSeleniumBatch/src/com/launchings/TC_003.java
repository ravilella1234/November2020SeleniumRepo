package com.launchings;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{

	private static final Logger log = Logger.getLogger(TC_003.class);
	
	public static void main(String[] args) throws Exception 
	{
		
		
		init();
		log.info("----------------   Started TC_003 ------------------------");
		log.info("initialising the dependency files...... ");
		
		launch("chromebrowser");
		log.info("Opening the browser :-" + p.getProperty("chromebrowser") );
		
		navigateUrl("amazonurl");
		log.info("Navigated to :- " + childProp.getProperty("amazonurl") );
		
		selectOption("amazondropdown_id","Books");
		log.info("Selected the option books by using the locator :- "+ orProp.getProperty("amazondropdown_id") );
		
		type("amazonsearchtext_name","Harry Potter");
		log.info("Entered the test Harry Potter by using locator :- " + orProp.getProperty("amazonsearchtext_name"));
	
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on search button by using locator :- " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		log.info("----------------   Ended TC_003 ------------------------");
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")).click();
		

	}

	

}

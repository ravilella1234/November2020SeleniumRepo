package com.selenium;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launchBrowser("chromebrowser");
		
		navigateUrl("iciciurl");

	}

}

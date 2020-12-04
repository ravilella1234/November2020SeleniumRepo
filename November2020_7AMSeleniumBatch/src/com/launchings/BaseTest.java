package com.launchings;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties parentProp;
	public static Properties childProp;
	public static Properties orProp;
	
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectPath + "/data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectPath +"/environment.properties");
		parentProp = new Properties();
		parentProp.load(fis);
		String e = parentProp.getProperty("env");
		System.out.println(e);
		
		fis =new FileInputStream(projectPath+"/"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		String value = childProp.getProperty("amazonurl");
		System.out.println(value);
		
		fis = new FileInputStream(projectPath+"/or.properties");
		orProp = new Properties();
		orProp.load(fis);
		
		fis = new FileInputStream(projectPath+"/log4jconfig.properties");
		PropertyConfigurator.configure(fis);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/Desktop/UpdatedDrivers/chromedriver.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "false");
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 16");
			option.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(option);
		}
		else if(p.getProperty(browser).equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/DELL/Desktop/UpdatedDrivers/geckodriver.exe");
			ProfilesIni  p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("NovemberFFProfile");
			profile.setPreference("dom.webnotifications.enabled", false);
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			
			driver = new FirefoxDriver(option);
		}
	}

	public static void navigateUrl(String url)
	{
		//driver.get(childProp.getProperty(url));
		driver.navigate().to(childProp.getProperty(url));
	}
	
	public static void clickElement(String locatorKey) 
	{
		getElement(locatorKey).click();;
		//driver.findElement(By.xpath(orProp.getProperty(locatorKey))).click();
	}

	

	public static void type(String locatorKey, String text) 
	{
		getElement(locatorKey).sendKeys(text);
		//driver.findElement(By.name(orProp.getProperty(locatorKey))).sendKeys(text);
	}

	public static void selectOption(String locatorKey, String item) 
	{
		getElement(locatorKey).sendKeys(item);
		//driver.findElement(By.id(orProp.getProperty(locatorKey))).sendKeys(item);
	}
	
	
	public static WebElement getElement(String locatorKey) 
	{
		WebElement element=null;
		
		if(locatorKey.endsWith("_id")) {
			element = driver.findElement(By.id(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element = driver.findElement(By.name(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_classname")) {
			element = driver.findElement(By.className(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_cssSelector")) {
			element = driver.findElement(By.cssSelector(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_linkText")) {
			element = driver.findElement(By.linkText(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_partiallinkText")) {
			element = driver.findElement(By.partialLinkText(orProp.getProperty(locatorKey)));
		}
		
		
		return element;
		
	}
}

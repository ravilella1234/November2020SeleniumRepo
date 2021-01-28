package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptExecutor 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/Desktop/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='ravilella'");
		
		  String title = js.executeScript("return document.title").toString();
		  System.out.println(title);
		  
		//js.executeScript("window.scrollBy(0,200)");
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  
		  js.executeScript("document.getElementById('u_0_2').scrollIntoView()");
		  
		  js.executeScript("window.history.back()");
		  
		  Thread.sleep(3000);
		  
		  js.executeScript("window.history.forward()");
		  
		  Thread.sleep(3000);
		  
		  js.executeScript("window.history.go(0)");
		
	}

}

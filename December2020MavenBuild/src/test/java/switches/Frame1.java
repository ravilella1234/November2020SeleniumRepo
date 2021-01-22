package switches;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("WebDriver")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("SearchContext")).click();

	}

}

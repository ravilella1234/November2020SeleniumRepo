package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable2 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/Desktop/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//WebElement loc = driver.findElement(By.xpath("//span[contains(text(),'More')]"));
		//System.out.println(loc.getAttribute("innerHTML"));
		Actions a  = new Actions(driver);
		a.doubleClick(driver.findElement(By.xpath("//span[contains(text(),'More')]"))).perform();
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'More')]"))));
		//driver.findElement(By.xpath("//span[contains(text(),'More')]")).click();

	}

}

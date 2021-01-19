package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	@FindBy(linkText="Sign in") private WebElement signInLink;
	@FindBy(id="email")private WebElement customerEmail;
	@FindBy(id="passwd")private WebElement customerPassword;
	@FindBy(xpath="//button[@id='SubmitLogin']")private WebElement signInButton;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")private WebElement customerValidation;
	
	public Login(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerLogin()
	{
		signInLink.click();
		customerEmail.sendKeys("qatest87487@gmail.com");
		customerPassword.sendKeys("password");
		signInButton.click();
	}
	
	public String customerVerification()
	{
		return customerValidation.getText();
	}
	
}

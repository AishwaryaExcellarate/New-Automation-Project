package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
		
	public void goToUrl()
	{
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

	}
	
	
	

}

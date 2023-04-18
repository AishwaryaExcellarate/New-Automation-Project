package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 

{
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".blinkingText")
	WebElement Blinkinglink;
	
	@FindBy(css=".im-para.red")
	WebElement nextwintext;
	
	
	@FindBy(xpath="//a[contains(.,'mentor@rahulshettyacademy.com')]")
	WebElement  emailid;
	
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="(//span[@class='checkmark'])[2]")
	WebElement checkmark;
	
	@FindBy(css=".btn.btn-success")
	WebElement popup;
	
	@FindBy(xpath="//select[@class='form-control']")
	WebElement selectrole;
	public void clickonBlinkinglink()
	{
		Blinkinglink.click();
	}
	public void gettextfromnextwindow()
	{
		nextwintext.getText();
	}
	
	public void getEmailidText()
	{
		emailid.getText();
		//.split("at")[1].trim().split(" ")[0];
	}
	public void getUsername(String uname)
	{
		Username.sendKeys(uname);                //rahulshettyacademy
	}
	
	public void getPassword(String pwd)
	{
		Password.sendKeys(pwd);                    //learning
	} 
	public void ClickonUserradiobtn()
	{
		checkmark.click();
	}
	public void clickOnOKbtn()
	{
		popup.click();
	}
	public void SelectRole(WebElement choose)
	{
		Select s=new Select(choose);
		s.selectByIndex(0);
	}
	
	

}

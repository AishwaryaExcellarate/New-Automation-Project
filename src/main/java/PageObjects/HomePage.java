package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import myAbstactComponents.AbstractComponent;

public class HomePage extends AbstractComponent
{
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//*[name()='svg'])[1]"))
	WebElement Elementsicon;
	
	@FindBy(xpath="(//div[@class=\\\"element-group\\\"])[1]")
    WebElement Elementsbutton;
	
	@FindBy(xpath="//span[contains(.,'Text Box')]")
	WebElement Textboxlink;
	
	@FindBy(id="userName")
	WebElement Usernameedt;
	
	@FindBy(id="userEmail")
	WebElement UserEmailedt;
	
	@FindBy(id="currentAddress")
	WebElement Address1;
	
	@FindBy(id="permanentAddress")
	WebElement Address2;
	
	@FindBy(css=".text-right.col-md-2.col-sm-12 button")
	WebElement submitbtn;
	
	@FindBy(id="output")
	WebElement outputtxt;
	
	@FindBy(xpath="//span[contains(.,'Check Box')]")
	WebElement checkboxlink;
	
	@FindBy(xpath="//span[@class='rct-checkbox']//*[name()='svg']")
	WebElement checkboxbtn;
	
	@FindBy(id="result")
	WebElement checkboxresult;
	
	@FindBy(id="item-4")
	WebElement doubleclicklink;
	
	@FindBy(xpath="//button[contains(.,'Double Click Me')]")
	WebElement doubleclickbtn;
	
	@FindBy(xpath="//img[@src='/images/Toolsqa.jpg']")
	WebElement backtohomebtn;
	
	public void ClickonElementsicon()
	{
		Elementsicon.click();
	}
	public void ClickonElementsbtn()
	{
		Elementsbutton.click();
	}
	public void ClickonTextboxfield()
	{
		Textboxlink.click();
	}
	public void editUsername(String uname)
	{
		Usernameedt.sendKeys(uname);
	}
	public void editUseremail(String email)
	{
		UserEmailedt.sendKeys(email);
	}
	public void editCurrentadd(String address)
	{
		Address1.sendKeys(address);
	}
	public void editPermanentadd(String homeadd)
	{
		Address2.sendKeys(homeadd);
	}
	public void ClickonSubmitbtn()
	{
		submitbtn.click();
	}
	public void getTextfromOutput()
	{
		outputtxt.getText();
	}
	public void Clickoncheckboxlnk()
	{
		checkboxlink.click();
	}
	public void Clickoncheckboxbtn()
	{
		checkboxbtn.click();
	}
	public void getResultfromCheckbox()
	{
		checkboxresult.getText();
	}
	public void Clickondoublelnk()
	{
		doubleclicklink.click();
	}
	public void Clickondoublebtn()
	{
		for(int i=0;i<2;i++)
		{
			doubleclickbtn.click();
		}
	}
	
	public void gobackToHome()
	{
		backtohomebtn.click();
	}
	
	
	
}

package E2E;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GeneralComponents.BaseClass;
import ObjectRepositry.ExcelData;
import ObjectRepositry.HomePage;
import ObjectRepositry.LoginPage;

public class rahulshettyacademyLoginpage  extends BaseClass
{
	@Test
	public void rahulshettyacademyloginpage() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.goToUrl();
		
		ExcelData ed=new ExcelData();
		ArrayList<String> data = ed.getDatafromExcel("Username");
		System.out.println(data.get(0));
	     
		HomePage hp=new HomePage(driver);
		hp.clickonBlinkinglink();
		hp.gettextfromnextwindow();
		hp.getEmailidText();
		hp.getUsername("rahulshettyacademy");
		hp.getPassword("learning");
		hp.ClickonUserradiobtn();
		hp.clickOnOKbtn();
		hp.SelectRole(null);
		
		
		
		
		
		
		
		
		
		
				
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		
		
		
		
		
	}

}

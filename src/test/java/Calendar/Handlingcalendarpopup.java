package Calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingcalendarpopup
{
	@Test
	public void handlingcalendar()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> choose = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement choosen : choose) 
		{
			if(choosen.getText().equalsIgnoreCase("India"))
			{
				choosen.click();
			}
		System.out.println(driver.findElement(By.id("autosuggest")).getText());
			
		}
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value='BLR']")).getText());
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).getText());
	
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active.ui-state-hover")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		WebElement staticdd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(staticdd);
		s.selectByIndex(3);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByVisibleText("AED");
		System.out.println(s.getFirstSelectedOption().getText());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//driver.quit();
		
		

	}

}

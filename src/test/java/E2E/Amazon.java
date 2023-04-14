package E2E;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon
{
	@Test
	public void amazon()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().deleteAllCookies();
		driver.get("https:www.amazon.com");
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.cssSelector("#nav-link-accountList"));
		driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[1]")).click();
		driver.findElement(By.id("a-page")).click();
		driver.findElement(By.id("twotabsearchtextbox")).click();
		act.moveToElement(ele).contextClick().build().perform();
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HELLO");
		driver.quit();
		
		
	}

}

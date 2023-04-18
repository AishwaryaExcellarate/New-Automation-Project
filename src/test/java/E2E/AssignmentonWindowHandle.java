package E2E;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentonWindowHandle
{
	@Test
	public void assignment()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().deleteAllCookies();
		driver.get("http://	the-internet.herokuapp.com ");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,+500)");
		driver.findElement(By.xpath("//a[contains(.,'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[.='Click Here']")).click();
		Set<String> switchtowindow = driver.getWindowHandles();
		Iterator<String> it = switchtowindow.iterator();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.findElement(By.xpath("//h3[.='Opening a new window']")).getText());
		String parentwindow = it.next();
		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.xpath("//h3[.='New Window']")).getText());
		driver.quit();
	}

}

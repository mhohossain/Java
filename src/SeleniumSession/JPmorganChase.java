package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JPmorganChase {
	
	WebDriver driver;
	@Test
	public void testModules() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.jpmorganchase.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	//	driver.switchTo().defaultContent();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id=\"jpmc_investor\"]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Fixed Income Information')]")).click();					
	}
	
   	
}



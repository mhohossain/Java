package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogeTitlePage {
	
	WebDriver driver;
	@BeforeMethod
	public void launchTheBrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}
	
	@Test(priority=0)
	public void getTitlePageTest() {		
		String title = driver.getTitle();
		System.out.println("Google title is: "+title);
		Assert.assertEquals(title, "Google");
		driver.close();
}
	@Test(priority=1)
	public void clickGmailLink() {
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		driver.close();		
	}
	@Test(priority=2)
	public void writeSelenium() {
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium");
		driver.quit();
	}
	
}
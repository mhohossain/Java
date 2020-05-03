package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitlePage {

	WebDriver driver;	
	@Test(priority=1)
	public void titlePage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
		
				
	}
	@Test(priority=2)	
	public void images() throws InterruptedException {
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
		driver.close();
	}

}

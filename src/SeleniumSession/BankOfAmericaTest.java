package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankOfAmericaTest {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void lunchApplication() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.bankofamerica.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void getTitlePage() {
		String title = driver.getTitle();
		System.out.println("Page tile is "+title);
		
		
	}
	
	@AfterMethod
	public void closeApplciation() {
		driver.quit();
	}

	

}

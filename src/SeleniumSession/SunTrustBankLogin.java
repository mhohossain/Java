package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SunTrustBankLogin {
	
	
	
	@Test
	
	public void loginTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.suntrust.com/");
		 driver.findElement(By.id("userID")).sendKeys("Araf12");
		 driver.findElement(By.id("sign-on-herosignon-OLB-password")).sendKeys("Hossain23");
		 driver.findElement(By.xpath("//input[@value='Sign On']")).click();
	}

}

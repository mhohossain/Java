package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindWatch {
	
	WebDriver driver;
	@Test
	public void testFindWatch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		By searchBox = (By.id("//input[@id='twotabsearchtextbox']"));		
		By searchButton= (By.xpath("//input[@value='Go']"));
	}

}

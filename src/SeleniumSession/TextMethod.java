package SeleniumSession;

import org.openqa.grid.internal.SessionTerminationReason;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TextMethod{
	
@Test
public void getText() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	String availabletext = driver.findElement(By.xpath("//a[contains(text(),'Images')]")).getText();
	System.out.println("Available text is "+availabletext);
	String currenturl = driver.getCurrentUrl();
	System.out.println("Current URL Available is "+currenturl);
	//driver.findElement(By.xpath("//img[@id='hplogo']")).sendKeys(Keys.ENTER);
	driver.quit();

}

}

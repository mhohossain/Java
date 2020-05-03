package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void loginPageTest() throws Exception {
		driver.findElement(By.id("email")).sendKeys("Araf");
		driver.findElement(By.id("pass")).sendKeys("hossain123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.navigate().back();
		
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		sel1.selectByVisibleText("Jan");
		Thread.sleep(3000);
		
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		sel2.selectByIndex(24);
		
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		sel3.selectByValue("2006");
		Thread.sleep(3000);		
		
		driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
		driver.findElement(By.xpath("//button[@id='u_0_y']")).click();
	}
	

}

package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BankOfAmericaTitleTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.get("https://www.bankofamerica.com/");
		 String title = driver.getTitle();
		 System.out.println("Bank of america title is "+title);
		 Assert.assertEquals(title, "Bank of America - Banking, Credit Cards, Loans and Investing");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//a[@id='NAV_ABOUT_US']")).click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//a[@id='NAV_BUSINESS_ADVANTAGE']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[@class='show-for-medium-up']")).click();
		// driver.navigate().back();
		 
		 Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='stateselectOL']")));
		 sel1.selectByVisibleText("Hawaii");
		 System.out.println("State is Hawaii");
		 driver.quit();
		 

	}

}

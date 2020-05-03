package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ara\\Desktop\\java jar files\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.get("https://www.bankofamerica.com/");
		 String title = driver.getTitle();
		 System.out.println("Bank of title is "+title);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='NAV_PERSONAL']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='NAV_BUSINESS_ADVANTAGE']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='NAV_WEALTH_MANAGEMENT']")).click();	 
		 Thread.sleep(3000);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//a[@id='NAV_BUSINESS_INSTITUTIONS']")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//a[@id='NAV_ABOUT_US']")).click();
		 Thread.sleep(2000);
		

	}

}

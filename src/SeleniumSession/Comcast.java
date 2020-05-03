package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comcast {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.get("https://my.xfinity.com/?cid=cust");
		 driver.findElement(By.xpath("//a[contains(text(),'My Xfinity')]")).click();
		 driver.navigate().back();
		 driver.findElement(By.xpath("//a[contains(text(),'Shop/Upgrade')]")).click();
		 driver.navigate().back();
		 driver.findElement(By.xpath("//a[contains(text(),'Support')]//parent::li//preceding-sibling::li//a[@name='myxfinity']")).click();
		 driver.navigate().back();
		 driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		 driver.findElement(By.name("user")).sendKeys("Araf0192");
		 driver.findElement(By.name("passwd")).sendKeys("hossain21");
		 driver.findElement(By.id("sign_in")).click();
		 
	}

}

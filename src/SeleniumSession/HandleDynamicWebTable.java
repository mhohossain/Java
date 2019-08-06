package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebTable {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://crmpro.com/index.html");
		 driver.findElement(By.name("username")).sendKeys("Araf16");
		 driver.findElement(By.name("password")).sendKeys("tester123");
		 WebElement loginbutn = driver.findElement(By.xpath("//input[@type='submit']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();" ,loginbutn);
		 
		 driver.switchTo().frame("mainpanel");
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[contains(text(),'Ara')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[contains(text(),'tom hossain')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[contains(text(),'araf16 mho')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[contains(text(),'araf16')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[contains(text(),'araf16 peter')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
         Thread.sleep(3000);
         driver.quit();
         
	}

}

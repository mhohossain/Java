package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CrmDealPage {
	 

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
         Actions action = new Actions(driver);
         action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
              
         driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
         driver.findElement(By.name("title")).sendKeys("CRMPRO");
         driver.findElement(By.name("client_lookup")).sendKeys("Google");
         driver.findElement(By.name("amount")).sendKeys("500");
         driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//td[@id='tab_vevents']")).click();
         
         driver.quit();
         
	}

}
